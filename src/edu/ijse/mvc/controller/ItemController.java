/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.ItemDto;
import edu.ijse.mvc.model.ItemModel;
import java.util.ArrayList;

/**
 *
 * @author anjan
 */
public class ItemController {
    private ItemModel itemModel;

    public ItemController() throws Exception{
        this.itemModel = new ItemModel();
    }
    
    public String saveItem(ItemDto itemDto) throws Exception{
        String resp = itemModel.saveItem(itemDto);
        return resp;
    }
    
    public ArrayList<ItemDto> getAllItem() throws Exception{
        ArrayList<ItemDto> itemDtos = itemModel.getAllItem();
        return itemDtos;
    }
    
    public ItemDto searchItem(String itemId) throws Exception{
        ItemDto itemDto = itemModel.getItem(itemId);
        return itemDto;
    }
    
}
