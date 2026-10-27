package xyz.adscope.common.v2.dev.info;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AdScopeUtil {
    private static final java.lang.String SP_KEY_SDK_ID = "scopeID";

    public AdScopeUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String generateScopeSDKID(android.content.Context r8) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = xyz.adscope.common.v2.dev.info.DeviceUtil.getBrand()
            java.lang.String r2 = xyz.adscope.common.v2.dev.info.DeviceUtil.getModel()
            java.lang.String r3 = xyz.adscope.common.v2.dev.info.DeviceUtil.getHardDisk()
            java.lang.String r4 = xyz.adscope.common.v2.dev.info.DeviceUtil.getAndroidRelease()
            long r5 = xyz.adscope.common.v2.dev.info.DeviceUtil.getFileMark()
            java.lang.String r7 = xyz.adscope.common.v2.dev.info.DeviceUtil.getDeviceUpdateMark()
            r0.append(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            r0.append(r5)
            r0.append(r7)
            long r1 = java.lang.System.currentTimeMillis()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = xyz.adscope.common.v2.encrypt.impl.MD5Util.md5(r0)
            java.lang.String r1 = xyz.adscope.common.v2.persistent.sp.CommonSpHelper.getCommonSPFile()
            java.lang.String r2 = "scopeID"
            xyz.adscope.common.v2.persistent.sp.CommonSpHelper.putString(r8, r1, r2, r0)
            return r0
    }

    public static java.lang.String getScopeSdkID(android.content.Context r3) {
            java.lang.String r0 = xyz.adscope.common.v2.persistent.sp.CommonSpHelper.getCommonSPFile()
            java.lang.String r1 = "scopeID"
            r2 = 0
            java.lang.String r0 = xyz.adscope.common.v2.persistent.sp.CommonSpHelper.getString(r3, r0, r1, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L16
            java.lang.String r3 = generateScopeSDKID(r3)
            return r3
        L16:
            return r0
    }
}
