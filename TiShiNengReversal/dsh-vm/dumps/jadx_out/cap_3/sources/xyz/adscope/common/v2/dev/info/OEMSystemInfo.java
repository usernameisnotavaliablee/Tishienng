package xyz.adscope.common.v2.dev.info;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class OEMSystemInfo {
    private xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEMInfo mInfo;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.v2.dev.info.OEMSystemInfo$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class InstanceHolder {
        private static xyz.adscope.common.v2.dev.info.OEMSystemInfo instance;

        static {
                xyz.adscope.common.v2.dev.info.OEMSystemInfo r0 = new xyz.adscope.common.v2.dev.info.OEMSystemInfo
                r1 = 0
                r0.<init>(r1)
                xyz.adscope.common.v2.dev.info.OEMSystemInfo.InstanceHolder.instance = r0
                return
        }

        private InstanceHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ xyz.adscope.common.v2.dev.info.OEMSystemInfo access$100() {
                xyz.adscope.common.v2.dev.info.OEMSystemInfo r0 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.InstanceHolder.instance
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum OEM extends java.lang.Enum<xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM> {
        private static final /* synthetic */ xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM[] $VALUES = null;
        public static final xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM EMUI = null;
        public static final xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM HARMONY = null;
        public static final xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM HYPER = null;
        public static final xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM MAGICUI = null;
        public static final xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM MEIZU = null;
        public static final xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM MIUI = null;
        public static final xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM NUBIA = null;
        public static final xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM ONEPLUS = null;
        public static final xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM OPPO = null;
        public static final xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM REALME = null;
        public static final xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM REDMI = null;
        public static final xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM VIVO = null;
        private final java.lang.String ROM;
        private final java.lang.String propVersion;

        private static /* synthetic */ xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM[] $values() {
                r0 = 12
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM[] r0 = new xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM[r0]
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r1 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.REALME
                r2 = 0
                r0[r2] = r1
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r1 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.OPPO
                r2 = 1
                r0[r2] = r1
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r1 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.MIUI
                r2 = 2
                r0[r2] = r1
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r1 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.HYPER
                r2 = 3
                r0[r2] = r1
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r1 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.REDMI
                r2 = 4
                r0[r2] = r1
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r1 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.HARMONY
                r2 = 5
                r0[r2] = r1
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r1 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.MAGICUI
                r2 = 6
                r0[r2] = r1
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r1 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.EMUI
                r2 = 7
                r0[r2] = r1
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r1 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.MEIZU
                r2 = 8
                r0[r2] = r1
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r1 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.ONEPLUS
                r2 = 9
                r0[r2] = r1
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r1 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.VIVO
                r2 = 10
                r0[r2] = r1
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r1 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.NUBIA
                r2 = 11
                r0[r2] = r1
                return r0
        }

        static {
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r0 = new xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM
                java.lang.String r1 = "REALME"
                r2 = 0
                java.lang.String r3 = "ColorOS"
                java.lang.String r4 = "ro.build.version.oplusrom"
                r0.<init>(r1, r2, r3, r4)
                xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.REALME = r0
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r0 = new xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM
                java.lang.String r1 = "OPPO"
                r2 = 1
                r0.<init>(r1, r2, r3, r4)
                xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.OPPO = r0
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r0 = new xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM
                java.lang.String r1 = "MIUI"
                r2 = 2
                java.lang.String r3 = "ro.miui.ui.version.name"
                r0.<init>(r1, r2, r1, r3)
                xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.MIUI = r0
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r0 = new xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM
                java.lang.String r2 = "HyperOS"
                java.lang.String r4 = "ro.mi.os.version.incremental"
                java.lang.String r5 = "HYPER"
                r6 = 3
                r0.<init>(r5, r6, r2, r4)
                xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.HYPER = r0
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r0 = new xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM
                java.lang.String r2 = "REDMI"
                r4 = 4
                r0.<init>(r2, r4, r1, r3)
                xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.REDMI = r0
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r0 = new xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM
                java.lang.String r1 = "HarmonyOS"
                java.lang.String r2 = "hw_sc.build.platform.version"
                java.lang.String r3 = "HARMONY"
                r4 = 5
                r0.<init>(r3, r4, r1, r2)
                xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.HARMONY = r0
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r0 = new xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM
                java.lang.String r1 = "MagicUI"
                java.lang.String r2 = "ro.build.version.magic"
                java.lang.String r3 = "MAGICUI"
                r4 = 6
                r0.<init>(r3, r4, r1, r2)
                xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.MAGICUI = r0
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r0 = new xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM
                r1 = 7
                java.lang.String r2 = "ro.build.version.emui"
                java.lang.String r3 = "EMUI"
                r0.<init>(r3, r1, r3, r2)
                xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.EMUI = r0
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r0 = new xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM
                java.lang.String r1 = "Flyme"
                java.lang.String r2 = "ro.build.display.id"
                java.lang.String r3 = "MEIZU"
                r4 = 8
                r0.<init>(r3, r4, r1, r2)
                xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.MEIZU = r0
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r0 = new xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM
                java.lang.String r1 = "HydrogenOS"
                java.lang.String r2 = "ro.rom.version"
                java.lang.String r3 = "ONEPLUS"
                r4 = 9
                r0.<init>(r3, r4, r1, r2)
                xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.ONEPLUS = r0
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r0 = new xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM
                java.lang.String r1 = "Funtouch"
                java.lang.String r2 = "ro.vivo.os.version"
                java.lang.String r3 = "VIVO"
                r4 = 10
                r0.<init>(r3, r4, r1, r2)
                xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.VIVO = r0
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r0 = new xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM
                java.lang.String r1 = "ro.build.nubia.rom.name"
                java.lang.String r2 = "ro.build.nubia.rom.code"
                java.lang.String r3 = "NUBIA"
                r4 = 11
                r0.<init>(r3, r4, r1, r2)
                xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.NUBIA = r0
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM[] r0 = $values()
                xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.$VALUES = r0
                return
        }

        OEM(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.ROM = r3
                r0.propVersion = r4
                return
        }

        static /* synthetic */ java.lang.String access$200(xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM r0) {
                java.lang.String r0 = r0.ROM
                return r0
        }

        static /* synthetic */ java.lang.String access$300(xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM r0) {
                java.lang.String r0 = r0.propVersion
                return r0
        }

        public static xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM> r0 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r1 = (xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM) r1
                return r1
        }

        public static xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM[] values() {
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM[] r0 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.$VALUES
                java.lang.Object r0 = r0.clone()
                xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM[] r0 = (xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class OEMInfo {
        private final java.lang.String ROM;
        private final java.lang.String VER;

        private OEMInfo(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.ROM = r1
                r0.VER = r2
                return
        }

        /* synthetic */ OEMInfo(java.lang.String r1, java.lang.String r2, xyz.adscope.common.v2.dev.info.OEMSystemInfo.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ java.lang.String access$500(xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEMInfo r0) {
                java.lang.String r0 = r0.ROM
                return r0
        }

        static /* synthetic */ java.lang.String access$600(xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEMInfo r0) {
                java.lang.String r0 = r0.VER
                return r0
        }
    }

    private OEMSystemInfo() {
            r2 = this;
            r2.<init>()
            xyz.adscope.common.v2.dev.info.OEMSystemInfo r0 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.InstanceHolder.access$100()
            if (r0 != 0) goto La
            return
        La:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Singleton ..."
            r0.<init>(r1)
            throw r0
    }

    /* synthetic */ OEMSystemInfo(xyz.adscope.common.v2.dev.info.OEMSystemInfo.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static xyz.adscope.common.v2.dev.info.OEMSystemInfo getInstance() {
            xyz.adscope.common.v2.dev.info.OEMSystemInfo r0 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.InstanceHolder.access$100()
            return r0
    }

    private java.lang.String getSystemPropValue(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = ""
            java.lang.String r2 = xyz.adscope.common.v2.dev.info.SystemPropertiesUtil.get(r2, r0)
            return r2
    }

    private void initByOEM(java.lang.String r3, xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM r4) {
            r2 = this;
            java.lang.String r3 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.access$200(r4)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L33
            java.lang.String r3 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.access$200(r4)
            java.lang.String r0 = "."
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L1f
            java.lang.String r3 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.access$200(r4)
            java.lang.String r3 = r2.getSystemPropValue(r3)
            goto L23
        L1f:
            java.lang.String r3 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.access$200(r4)
        L23:
            xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEMInfo r0 = new xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEMInfo
            java.lang.String r4 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.access$300(r4)
            java.lang.String r4 = r2.getSystemPropValue(r4)
            r1 = 0
            r0.<init>(r3, r4, r1)
            r2.mInfo = r0
        L33:
            return
    }

    private void initHonorSeries(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.isHarmonyOS()
            if (r0 == 0) goto Lc
            xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r0 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.HARMONY
            r2.initByOEM(r3, r0)
            return
        Lc:
            xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r0 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.MAGICUI
            java.lang.String r1 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.access$300(r0)
            java.lang.String r1 = r2.getSystemPropValue(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L20
            r2.initByOEM(r3, r0)
            return
        L20:
            xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r0 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.EMUI
            r2.initByOEM(r3, r0)
            return
    }

    private void initHuaweiSeries(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.isHarmonyOS()
            if (r0 == 0) goto Lc
            xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r0 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.HARMONY
            r1.initByOEM(r2, r0)
            return
        Lc:
            xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r0 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.EMUI
            r1.initByOEM(r2, r0)
            return
    }

    private void initXiaoMiSeries(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "ro.miui.ui.version.code"
            java.lang.String r1 = "0"
            java.lang.String r0 = xyz.adscope.common.v2.dev.info.SystemPropertiesUtil.get(r0, r1)
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L16
            r1 = 816(0x330, float:1.143E-42)
            if (r0 < r1) goto L16
            xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r0 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.HYPER     // Catch: java.lang.NumberFormatException -> L16
            r2.initByOEM(r3, r0)     // Catch: java.lang.NumberFormatException -> L16
            return
        L16:
            xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r0 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.MIUI
            r2.initByOEM(r3, r0)
            return
    }

    private boolean isHarmonyOS() {
            r3 = this;
            java.lang.String r0 = "com.huawei.system.BuildEx"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L1a
            java.lang.String r1 = "getOsBrand"
            r2 = 0
            java.lang.reflect.Method r1 = r0.getMethod(r1, r2)     // Catch: java.lang.Exception -> L1a
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L1a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L1a
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L1a
            r0 = r0 ^ 1
            return r0
        L1a:
            r0 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r0)
            r0 = 0
            return r0
    }

    private java.lang.String shrinkBoard(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = ""
            if (r0 != 0) goto L13
            java.lang.String r0 = " "
            java.lang.String r3 = r3.replaceAll(r0, r1)
            java.lang.String r3 = r3.toUpperCase()
            return r3
        L13:
            return r1
    }

    public java.lang.String getROM() {
            r1 = this;
            xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEMInfo r0 = r1.mInfo
            if (r0 == 0) goto L9
            java.lang.String r0 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEMInfo.access$500(r0)
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    public java.lang.String getRomVersion() {
            r1 = this;
            xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEMInfo r0 = r1.mInfo
            if (r0 == 0) goto L9
            java.lang.String r0 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEMInfo.access$600(r0)
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    public void initializeOEMInfo() {
            r3 = this;
            xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEMInfo r0 = r3.mInfo
            if (r0 == 0) goto L5
            goto L58
        L5:
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r0 = r3.shrinkBoard(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L58
            xyz.adscope.common.v2.dev.info.OEMSystemInfo$OEM r1 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.OEM.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> L16
            goto L17
        L16:
            r1 = 0
        L17:
            if (r1 == 0) goto L1d
            r3.initByOEM(r0, r1)
            goto L58
        L1d:
            r0.getClass()
            int r1 = r0.hashCode()
            r2 = -1
            switch(r1) {
                case -1706170181: goto L3f;
                case 68924490: goto L34;
                case 2141820391: goto L29;
                default: goto L28;
            }
        L28:
            goto L49
        L29:
            java.lang.String r1 = "HUAWEI"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L32
            goto L49
        L32:
            r2 = 2
            goto L49
        L34:
            java.lang.String r1 = "HONOR"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L3d
            goto L49
        L3d:
            r2 = 1
            goto L49
        L3f:
            java.lang.String r1 = "XIAOMI"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L48
            goto L49
        L48:
            r2 = 0
        L49:
            switch(r2) {
                case 0: goto L55;
                case 1: goto L51;
                case 2: goto L4d;
                default: goto L4c;
            }
        L4c:
            goto L58
        L4d:
            r3.initHuaweiSeries(r0)
            goto L58
        L51:
            r3.initHonorSeries(r0)
            goto L58
        L55:
            r3.initXiaoMiSeries(r0)
        L58:
            return
    }
}
