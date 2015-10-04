package rni18n.mobile.laplanete.ca.rni18n;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nic on 15-10-04.
 */
public class RNI18n extends ReactContextBaseJavaModule {

    public RNI18n(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "RNI18n";
    }

    @ReactMethod
    public String getCurrentLocale()  {
        return getReactApplicationContext().getResources().getConfiguration().locale.toString();
    }

    @Override
    public Map<String, Object> getConstants() {
        final Map<String, Object> constants = new HashMap<>();
        constants.put("locale", getCurrentLocale());
        return constants;
    }
}
