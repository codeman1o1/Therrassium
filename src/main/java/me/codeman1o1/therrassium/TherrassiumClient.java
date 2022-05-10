package me.codeman1o1.therrassium;

import de.guntram.mcmod.crowdintranslate.CrowdinTranslate;
import net.fabricmc.api.ClientModInitializer;

public class TherrassiumClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        CrowdinTranslate.downloadTranslations("Therrassium", "therrassium");
    }

}
