package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:browserstack.properties"
})

public interface BrowserstackConfig extends Config {

    String username();

    String password();

    @Key("bs")
    @DefaultValue("bs://23ac55c6b9e39f1c28dd76a612389e67fff0e90f")
    String bs();

    @Key("device")
    @DefaultValue("Google Pixel 3")
    String device();

    @Key("osVersion")
    @DefaultValue("9.0")
    String osVersion();

}
