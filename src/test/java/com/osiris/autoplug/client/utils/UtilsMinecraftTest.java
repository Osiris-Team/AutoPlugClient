/*
 * Copyright (c) 2022 Osiris-Team.
 * All rights reserved.
 *
 * This software is copyrighted work, licensed under the terms
 * of the MIT-License. Consult the "LICENSE" file for details.
 */

package com.osiris.autoplug.client.utils;

import com.osiris.autoplug.client.UT;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class UtilsMinecraftTest {
    UtilsMinecraft utilsMinecraft = new UtilsMinecraft();

    @Test
    void getInstalledVersion() {
        UT.initLogger();
        File path = new File(System.getProperty("user.dir") + "/test/server.jar");
        assertEquals("1.18.2", utilsMinecraft.getInstalledVersion(path));
    }

    @Test
    void getPlugins() throws FileNotFoundException {
        UT.initLogger();
        File path = new File(System.getProperty("user.dir") + "/test");
        assertFalse(utilsMinecraft.getPlugins(path).isEmpty());
    }

    @Test
    void getMods() throws FileNotFoundException {
        UT.initLogger();
        File path = new File(System.getProperty("user.dir") + "/test");
        assertFalse(utilsMinecraft.getMods(path).isEmpty());
    }
}