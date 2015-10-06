package oose.dea.services.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.*;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Wijnand on 5-10-2015.
 */
@SuppressWarnings({"SpellCheckingInspection", "JavaDoc"})
@Path("/items")
public class ItemRestService {
    /**
     * ArrayList<Item>, collection of items.
     */
    private ArrayList<Item> Items = new ArrayList<>();

    public ItemRestService() {
        if(Items.isEmpty())
        {
            setItems();
        }
    }

    /**
     * @return JSON Items
     * @throws JsonProcessingException
     */
    @GET
    @Produces("application/json")
    public String getJsonItems() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(Items);
    }

    /**
     * @param sku
     * @return JSON Item with sku
     * @throws JsonProcessingException
     */
    @Path("/{sku}")
    @GET
    @Produces("application/json")
    public Item getJsonItem(@PathParam("sku") String sku) throws JsonProcessingException {
        Item item = null;
        for (Item i: Items) {
            if (i.getSku().equals(sku)) {
                item = i;
            }
        }
        return item;
    }

    /**
     * @param post
     * @return JSON The updated collection of items.
     * @throws IOException
     */
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public String addItem(String post) throws IOException {
        Item item = new ObjectMapper().readValue(post, Item.class);
        Items.add(item);
        return new ObjectMapper().writeValueAsString(Items);
    }

    /**
     * Delete items where SKU
     * @param sku
     * @return JSON remaining Items
     * @throws JsonProcessingException
     */
    @Path("/delete/{sku}")
    @GET
    @Produces("application/json")
    public String deleteItem(@PathParam("sku") String sku) throws JsonProcessingException {
        // Doesn't work!
        //noinspection Convert2streamapi
        for(Item item : Items) {
            if(item.getSku().equals(sku)) {
                Items.remove(Items.indexOf(item));
            }
        }

        if(Items.size() > 0) {
            return new ObjectMapper().writeValueAsString(Items);
        }
        else {
            return "{\"Emptry List\" : \"All items are removed from the list.\"}";
        }
    }

    @Path("/delete")
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public String deleteItem2(String tmp) throws IOException {
        Item dItem = new ObjectMapper().readValue(tmp, Item.class);
        for (Item item : Items) {
            if (item.getSku().equals(dItem.getSku())) {
                Items.remove(Items.indexOf(item));
            }
        }
        return new ObjectMapper().writeValueAsString(Items);
    }

        /**
         * Add items to Items.
         */
    private void setItems() {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("trein", "wielen", "wagon"));
        items.add(new Item("auto", "stuur", "gordels"));
        Items = items;
    }
}
