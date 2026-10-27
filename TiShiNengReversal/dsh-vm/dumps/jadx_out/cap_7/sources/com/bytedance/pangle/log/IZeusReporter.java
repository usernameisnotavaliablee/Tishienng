package com.bytedance.pangle.log;

@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public interface IZeusReporter {
    public static final java.lang.String ZEUS_STAGE_COMMON = "zeus_stage_common";
    public static final java.lang.String ZEUS_STAGE_CONTENT_PROVIDER = "zeus_stage_content_provider";
    public static final java.lang.String ZEUS_STAGE_DEX_OPT = "zeus_stage_dex_opt";
    public static final java.lang.String ZEUS_STAGE_ERROR = "zeus_stage_error";
    public static final java.lang.String ZEUS_STAGE_FLIPPED = "zeus_stage_flipped";
    public static final java.lang.String ZEUS_STAGE_PLUGIN_INSTALL = "zeus_stage_plugin_install";
    public static final java.lang.String ZEUS_STAGE_SERVER_MANAGER = "zeus_stage_plugin";
    public static final java.lang.String ZEUS_STAGE_WEB = "zeus_stage_web";

    void report(java.lang.String r1, org.json.JSONObject r2);

    void saveRecord(java.lang.String r1, java.lang.String r2);
}
