package br.com.minecart.core.config;

public class MinecartCoreConfig {
    public static String version = "";
    public static String game = "";
    public static String authorization = "";
    public static String shopServer = "";

    public static void configure(
        String version,
        String game,
        String authorization,
        String shopServer
    ) {
        MinecartCoreConfig.version = version;
        MinecartCoreConfig.game = game;
        MinecartCoreConfig.authorization = authorization;
        MinecartCoreConfig.shopServer = shopServer;
    }
}
