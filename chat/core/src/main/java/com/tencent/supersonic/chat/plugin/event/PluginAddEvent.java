package com.tencent.supersonic.chat.plugin.event;

import com.tencent.supersonic.chat.plugin.Plugin;
import org.springframework.context.ApplicationEvent;

public class PluginAddEvent extends ApplicationEvent {

    private Plugin plugin;

    public PluginAddEvent(Object source, Plugin plugin) {
        super(source);
        this.plugin = plugin;
    }

    public Plugin getPlugin() {
        return plugin;
    }
}
