package ca.alphaworld.alphaworld2.registries;

import ca.alphaworld.alphaworld2.client.screen.CrucibleScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class AlphaWorld2ScreenHandlers {
    public static ScreenHandlerType<CrucibleScreenHandler> CRUCIBLE_SCREEN_HANDLER = new ExtendedScreenHandlerType<>(CrucibleScreenHandler::new);

    public static void registerAllScreenHandlers() {
        Registry.register(Registries.SCREEN_HANDLER, new Identifier("alphaworld2", "crucible"), CRUCIBLE_SCREEN_HANDLER);
    }
}
