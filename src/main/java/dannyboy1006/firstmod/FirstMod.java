package dannyboy1006.firstmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import lists.ItemList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("firstmod")
public class FirstMod {
	
	public static FirstMod instance;
	public static final String modid = "firstmod";
	private static final Logger logger = LogManager.getLogger(modid);
	
	public FirstMod() {
		
		instance = this;
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		
		logger.info("Setup method register");
	}
	
	private void clientRegistries(final FMLClientSetupEvent event) {
		
		logger.info("clientRegistries method register");
	}
	
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents{
		
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item>event) {
			
			event.getRegistry().registerAll(
				
				ItemList.tutorial_item = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("tutorial_item"))
			);
			
			logger.info("Items registered");
		}
		
		private static ResourceLocation location(String name){
			return new ResourceLocation(modid,name);
			
		}
	}
}
