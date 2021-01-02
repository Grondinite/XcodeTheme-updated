package com.vermouthx.xcodetheme;

import com.intellij.ide.plugins.PluginManagerCore;
import com.intellij.openapi.extensions.PluginId;

import java.util.Objects;

public class XcTMeta {

    private XcTMeta() {
    }

    public final static String XC_PLUGIN_ID = "com.vermouthx.xcode-theme";

    public static String currentVersion() {
        return Objects.requireNonNull(PluginManagerCore.getPlugin(PluginId.getId(XC_PLUGIN_ID))).getVersion();
    }
}
