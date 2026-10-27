package xyz.adscope.common.v2.dev.info;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class ResIdentify {
    private static final java.lang.String APP_ICON = "app_icon";
    private static final java.lang.String APP_NAME = "app_name";
    public static final java.lang.String RES_TYPE_DRAWABLE = "drawable";
    public static final java.lang.String RES_TYPE_ID = "id";
    public static final java.lang.String RES_TYPE_LAYOUT = "layout";
    public static final java.lang.String RES_TYPE_MIPMAP = "mipmap";
    public static final java.lang.String RES_TYPE_RAW = "raw";
    public static final java.lang.String RES_TYPE_STRING = "string";
    public static final java.lang.String RES_TYPE_STYLE = "style";

    private ResIdentify() {
            r2 = this;
            r2.<init>()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "class don't need new instance"
            r0.<init>(r1)
            throw r0
    }

    public static int getAppIconIdentify(android.content.Context r1) {
            java.lang.String r0 = "app_icon"
            int r1 = getDrawableIdentify(r1, r0)
            return r1
    }

    public static int getAppNameIdentify(android.content.Context r1) {
            java.lang.String r0 = "app_name"
            int r1 = getStringIdentify(r1, r0)
            return r1
    }

    public static int getDrawableIdentify(android.content.Context r1, java.lang.String r2) {
            java.lang.String r0 = "drawable"
            int r1 = getResIdentify(r1, r0, r2)
            return r1
    }

    public static int getIDIdentify(android.content.Context r1, java.lang.String r2) {
            java.lang.String r0 = "id"
            int r1 = getResIdentify(r1, r0, r2)
            return r1
    }

    public static int getLayoutIdentify(android.content.Context r1, java.lang.String r2) {
            java.lang.String r0 = "layout"
            int r1 = getResIdentify(r1, r0, r2)
            return r1
    }

    public static int getMipmapIdentify(android.content.Context r2, java.lang.String r3) {
            android.content.res.Resources r0 = r2.getResources()
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r1 = "mipmap"
            int r2 = r0.getIdentifier(r3, r1, r2)
            return r2
    }

    public static int getRawIdentify(android.content.Context r2, java.lang.String r3) {
            android.content.res.Resources r0 = r2.getResources()
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r1 = "raw"
            int r2 = r0.getIdentifier(r3, r1, r2)
            return r2
    }

    public static int getResIdentify(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            android.content.res.Resources r0 = r1.getResources()
            java.lang.String r1 = r1.getPackageName()
            int r1 = r0.getIdentifier(r3, r2, r1)
            return r1
    }

    public static int getStringIdentify(android.content.Context r1, java.lang.String r2) {
            java.lang.String r0 = "string"
            int r1 = getResIdentify(r1, r0, r2)
            return r1
    }

    public static int getStyleIdentify(android.content.Context r1, java.lang.String r2) {
            java.lang.String r0 = "style"
            int r1 = getResIdentify(r1, r0, r2)
            return r1
    }
}
