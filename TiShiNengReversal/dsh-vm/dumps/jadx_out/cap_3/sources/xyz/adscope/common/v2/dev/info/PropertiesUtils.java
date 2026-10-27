package xyz.adscope.common.v2.dev.info;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class PropertiesUtils {
    private static final java.lang.String DEBUG_MODEL = "debugModel";
    private static final java.lang.String LOG_LEVEL = "logLevel";
    private java.util.Properties properties;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.v2.dev.info.PropertiesUtils$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class InstanceHolder {
        private static xyz.adscope.common.v2.dev.info.PropertiesUtils instance;

        static {
                xyz.adscope.common.v2.dev.info.PropertiesUtils r0 = new xyz.adscope.common.v2.dev.info.PropertiesUtils
                r1 = 0
                r0.<init>(r1)
                xyz.adscope.common.v2.dev.info.PropertiesUtils.InstanceHolder.instance = r0
                return
        }

        private InstanceHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ xyz.adscope.common.v2.dev.info.PropertiesUtils access$000() {
                xyz.adscope.common.v2.dev.info.PropertiesUtils r0 = xyz.adscope.common.v2.dev.info.PropertiesUtils.InstanceHolder.instance
                return r0
        }
    }

    private PropertiesUtils() {
            r2 = this;
            r2.<init>()
            xyz.adscope.common.v2.dev.info.PropertiesUtils r0 = xyz.adscope.common.v2.dev.info.PropertiesUtils.InstanceHolder.access$000()
            if (r0 != 0) goto La
            return
        La:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Singleton ..."
            r0.<init>(r1)
            throw r0
    }

    /* synthetic */ PropertiesUtils(xyz.adscope.common.v2.dev.info.PropertiesUtils.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static xyz.adscope.common.v2.dev.info.PropertiesUtils getInstance() {
            xyz.adscope.common.v2.dev.info.PropertiesUtils r0 = xyz.adscope.common.v2.dev.info.PropertiesUtils.InstanceHolder.access$000()
            return r0
    }

    public int getLogLevel() {
            r3 = this;
            java.util.Properties r0 = r3.properties
            if (r0 == 0) goto L19
            java.lang.String r1 = "logLevel"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L19
            java.util.Properties r0 = r3.properties
            java.lang.String r2 = "0"
            java.lang.String r0 = r0.getProperty(r1, r2)
            int r0 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r0)
            return r0
        L19:
            r0 = 0
            return r0
    }

    public boolean isDebugModel() {
            r3 = this;
            java.util.Properties r0 = r3.properties
            if (r0 == 0) goto L1b
            java.lang.String r1 = "debugModel"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L1b
            java.util.Properties r0 = r3.properties
            java.lang.String r2 = "false"
            java.lang.String r0 = r0.getProperty(r1, r2)
            java.lang.String r1 = "true"
            boolean r0 = r1.equals(r0)
            return r0
        L1b:
            r0 = 0
            return r0
    }

    public void loadPropertiesFormAssets(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            if (r2 == 0) goto L2d
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L2d
            r0 = 0
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L20
            java.io.InputStream r0 = r2.open(r3)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L20
            java.util.Properties r2 = new java.util.Properties     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L20
            r2.<init>()     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L20
            r1.properties = r2     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L20
            r2.load(r0)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L20
            if (r0 == 0) goto L2d
            goto L2a
        L1e:
            r2 = move-exception
            goto L22
        L20:
            goto L28
        L22:
            if (r0 == 0) goto L27
            xyz.adscope.common.v2.tool.io.IOUtils.closeQuietly(r0)
        L27:
            throw r2
        L28:
            if (r0 == 0) goto L2d
        L2a:
            xyz.adscope.common.v2.tool.io.IOUtils.closeQuietly(r0)
        L2d:
            return
    }
}
