/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.allgofree.rs2blitz.api;

/**
 * A plugin for the server.
 * @author ry60003333
 */
public interface Plugin
{
    /**
     * Get the name of the Plugin.
     * @return The name of the Plugin.
     */
    public String getName();

    /**
     * Get the author of the Plugin.
     * @return The author of the Plugin.
     */
    public String getAuthor();

    /**
     * Get the version of the Plugin.
     * @return The version of the Plugin.
     */
    public int getVersion();
}
