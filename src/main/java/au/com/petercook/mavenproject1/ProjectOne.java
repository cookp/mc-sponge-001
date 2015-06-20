/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.petercook.mavenproject1;

import org.spongepowered.api.event.Subscribe;
import org.spongepowered.api.event.state.ServerStartedEvent;
import org.spongepowered.api.plugin.Plugin;

// for logging
import com.google.inject.Inject;
import org.slf4j.Logger;

/**
 *
 * @author peter
 */
@Plugin(id = "projectone", name = "Project One", version = "1.0")
public class ProjectOne {
    
    @Inject
    Logger logger;
    
    @Subscribe
    public void onServerStart(ServerStartedEvent event) {
        // Hey! The server has started!
        
        logger.info("Sponge Mod One");
    }
}
