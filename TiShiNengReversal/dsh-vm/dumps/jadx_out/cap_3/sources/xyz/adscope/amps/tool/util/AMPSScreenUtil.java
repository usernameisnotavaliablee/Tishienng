package xyz.adscope.amps.tool.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSScreenUtil {
    public AMPSScreenUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final int getScreenHeight(android.content.Context r0) {
            xyz.adscope.common.info.DeviceInfo r0 = xyz.adscope.common.info.DeviceInfo.getInstance(r0)
            int r0 = r0.getResolutionHeight()
            return r0
    }

    public static final int getScreenWidth(android.content.Context r0) {
            xyz.adscope.common.info.DeviceInfo r0 = xyz.adscope.common.info.DeviceInfo.getInstance(r0)
            int r0 = r0.getResolutionWidth()
            return r0
    }
}
