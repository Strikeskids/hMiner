/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fallboo.miner.data;

/**
 *
 * @author Jake
 */
public enum Ores {

    COPPER(436), TIN(438), IRON(440), SILVER(442), COAL(453), MITHRIL(447), ADDY(449), GOLD(358);
    private int id;

    Ores(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
