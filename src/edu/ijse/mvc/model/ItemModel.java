/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.ItemDto;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author anjan
 */
public class ItemModel {
    private final Connection connection;

    public ItemModel() throws ClassNotFoundException, SQLException {
        this.connection = DBConnection.getInstance().getConnection();
    }
    
    public String saveItem(ItemDto itemDto) throws Exception{
        String sql = "INSERT INTO item VALUES(?,?,?,?,?)";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, itemDto.getCode());
        statement.setString(2, itemDto.getDescription());
        statement.setString(3, itemDto.getPackSize());
        statement.setDouble(4, itemDto.getUnitPrice());
        statement.setInt(5, itemDto.getQoh());
        
        return statement.executeUpdate() >0 ? "Success" : "Fail";
    }
}
