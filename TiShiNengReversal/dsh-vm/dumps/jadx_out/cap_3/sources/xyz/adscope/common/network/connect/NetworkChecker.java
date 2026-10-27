package xyz.adscope.common.network.connect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class NetworkChecker {
    private android.net.ConnectivityManager a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.network.connect.NetworkChecker$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = null;

        static {
                xyz.adscope.common.network.connect.NetworkChecker$NetType[] r0 = xyz.adscope.common.network.connect.NetworkChecker.NetType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                xyz.adscope.common.network.connect.NetworkChecker.AnonymousClass1.a = r0
                xyz.adscope.common.network.connect.NetworkChecker$NetType r1 = xyz.adscope.common.network.connect.NetworkChecker.NetType.Wifi     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = xyz.adscope.common.network.connect.NetworkChecker.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L1d
                xyz.adscope.common.network.connect.NetworkChecker$NetType r1 = xyz.adscope.common.network.connect.NetworkChecker.NetType.Wired     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = xyz.adscope.common.network.connect.NetworkChecker.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L28
                xyz.adscope.common.network.connect.NetworkChecker$NetType r1 = xyz.adscope.common.network.connect.NetworkChecker.NetType.Mobile     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = xyz.adscope.common.network.connect.NetworkChecker.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L33
                xyz.adscope.common.network.connect.NetworkChecker$NetType r1 = xyz.adscope.common.network.connect.NetworkChecker.NetType.Mobile2G     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = xyz.adscope.common.network.connect.NetworkChecker.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L3e
                xyz.adscope.common.network.connect.NetworkChecker$NetType r1 = xyz.adscope.common.network.connect.NetworkChecker.NetType.Mobile3G     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = xyz.adscope.common.network.connect.NetworkChecker.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L49
                xyz.adscope.common.network.connect.NetworkChecker$NetType r1 = xyz.adscope.common.network.connect.NetworkChecker.NetType.Mobile4G     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum NetType extends java.lang.Enum<xyz.adscope.common.network.connect.NetworkChecker.NetType> {
        public static final xyz.adscope.common.network.connect.NetworkChecker.NetType Mobile = null;
        public static final xyz.adscope.common.network.connect.NetworkChecker.NetType Mobile2G = null;
        public static final xyz.adscope.common.network.connect.NetworkChecker.NetType Mobile3G = null;
        public static final xyz.adscope.common.network.connect.NetworkChecker.NetType Mobile4G = null;
        public static final xyz.adscope.common.network.connect.NetworkChecker.NetType Wifi = null;
        public static final xyz.adscope.common.network.connect.NetworkChecker.NetType Wired = null;
        private static final /* synthetic */ xyz.adscope.common.network.connect.NetworkChecker.NetType[] a = null;

        static {
                xyz.adscope.common.network.connect.NetworkChecker$NetType r0 = new xyz.adscope.common.network.connect.NetworkChecker$NetType
                java.lang.String r1 = "Wifi"
                r2 = 0
                r0.<init>(r1, r2)
                xyz.adscope.common.network.connect.NetworkChecker.NetType.Wifi = r0
                xyz.adscope.common.network.connect.NetworkChecker$NetType r0 = new xyz.adscope.common.network.connect.NetworkChecker$NetType
                java.lang.String r1 = "Wired"
                r2 = 1
                r0.<init>(r1, r2)
                xyz.adscope.common.network.connect.NetworkChecker.NetType.Wired = r0
                xyz.adscope.common.network.connect.NetworkChecker$NetType r0 = new xyz.adscope.common.network.connect.NetworkChecker$NetType
                java.lang.String r1 = "Mobile"
                r2 = 2
                r0.<init>(r1, r2)
                xyz.adscope.common.network.connect.NetworkChecker.NetType.Mobile = r0
                xyz.adscope.common.network.connect.NetworkChecker$NetType r0 = new xyz.adscope.common.network.connect.NetworkChecker$NetType
                java.lang.String r1 = "Mobile2G"
                r2 = 3
                r0.<init>(r1, r2)
                xyz.adscope.common.network.connect.NetworkChecker.NetType.Mobile2G = r0
                xyz.adscope.common.network.connect.NetworkChecker$NetType r0 = new xyz.adscope.common.network.connect.NetworkChecker$NetType
                java.lang.String r1 = "Mobile3G"
                r2 = 4
                r0.<init>(r1, r2)
                xyz.adscope.common.network.connect.NetworkChecker.NetType.Mobile3G = r0
                xyz.adscope.common.network.connect.NetworkChecker$NetType r0 = new xyz.adscope.common.network.connect.NetworkChecker$NetType
                java.lang.String r1 = "Mobile4G"
                r2 = 5
                r0.<init>(r1, r2)
                xyz.adscope.common.network.connect.NetworkChecker.NetType.Mobile4G = r0
                xyz.adscope.common.network.connect.NetworkChecker$NetType[] r0 = a()
                xyz.adscope.common.network.connect.NetworkChecker.NetType.a = r0
                return
        }

        NetType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ xyz.adscope.common.network.connect.NetworkChecker.NetType[] a() {
                r0 = 6
                xyz.adscope.common.network.connect.NetworkChecker$NetType[] r0 = new xyz.adscope.common.network.connect.NetworkChecker.NetType[r0]
                xyz.adscope.common.network.connect.NetworkChecker$NetType r1 = xyz.adscope.common.network.connect.NetworkChecker.NetType.Wifi
                r2 = 0
                r0[r2] = r1
                xyz.adscope.common.network.connect.NetworkChecker$NetType r1 = xyz.adscope.common.network.connect.NetworkChecker.NetType.Wired
                r2 = 1
                r0[r2] = r1
                xyz.adscope.common.network.connect.NetworkChecker$NetType r1 = xyz.adscope.common.network.connect.NetworkChecker.NetType.Mobile
                r2 = 2
                r0[r2] = r1
                xyz.adscope.common.network.connect.NetworkChecker$NetType r1 = xyz.adscope.common.network.connect.NetworkChecker.NetType.Mobile2G
                r2 = 3
                r0[r2] = r1
                xyz.adscope.common.network.connect.NetworkChecker$NetType r1 = xyz.adscope.common.network.connect.NetworkChecker.NetType.Mobile3G
                r2 = 4
                r0[r2] = r1
                xyz.adscope.common.network.connect.NetworkChecker$NetType r1 = xyz.adscope.common.network.connect.NetworkChecker.NetType.Mobile4G
                r2 = 5
                r0[r2] = r1
                return r0
        }

        public static xyz.adscope.common.network.connect.NetworkChecker.NetType valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.common.network.connect.NetworkChecker$NetType> r0 = xyz.adscope.common.network.connect.NetworkChecker.NetType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.common.network.connect.NetworkChecker$NetType r1 = (xyz.adscope.common.network.connect.NetworkChecker.NetType) r1
                return r1
        }

        public static xyz.adscope.common.network.connect.NetworkChecker.NetType[] values() {
                xyz.adscope.common.network.connect.NetworkChecker$NetType[] r0 = xyz.adscope.common.network.connect.NetworkChecker.NetType.a
                java.lang.Object r0 = r0.clone()
                xyz.adscope.common.network.connect.NetworkChecker$NetType[] r0 = (xyz.adscope.common.network.connect.NetworkChecker.NetType[]) r0
                return r0
        }
    }

    public NetworkChecker(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            r1.a = r2
            return
    }

    private static boolean a(android.net.NetworkInfo r1) {
            if (r1 == 0) goto L10
            boolean r0 = r1.isAvailable()
            if (r0 == 0) goto L10
            boolean r1 = r1.isConnected()
            if (r1 == 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    private static boolean a(xyz.adscope.common.network.connect.NetworkChecker.NetType r2, android.net.NetworkInfo r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int[] r1 = xyz.adscope.common.network.connect.NetworkChecker.AnonymousClass1.a
            int r2 = r2.ordinal()
            r2 = r1[r2]
            r1 = 1
            switch(r2) {
                case 1: goto L61;
                case 2: goto L50;
                case 3: goto L41;
                case 4: goto L31;
                case 5: goto L21;
                case 6: goto L11;
                default: goto L10;
            }
        L10:
            return r0
        L11:
            xyz.adscope.common.network.connect.NetworkChecker$NetType r2 = xyz.adscope.common.network.connect.NetworkChecker.NetType.Mobile
            boolean r2 = a(r2, r3)
            if (r2 != 0) goto L1a
            return r0
        L1a:
            xyz.adscope.common.network.connect.NetworkChecker$NetType r2 = xyz.adscope.common.network.connect.NetworkChecker.NetType.Mobile4G
            boolean r2 = b(r2, r3)
            return r2
        L21:
            xyz.adscope.common.network.connect.NetworkChecker$NetType r2 = xyz.adscope.common.network.connect.NetworkChecker.NetType.Mobile
            boolean r2 = a(r2, r3)
            if (r2 != 0) goto L2a
            return r0
        L2a:
            xyz.adscope.common.network.connect.NetworkChecker$NetType r2 = xyz.adscope.common.network.connect.NetworkChecker.NetType.Mobile3G
            boolean r2 = b(r2, r3)
            return r2
        L31:
            xyz.adscope.common.network.connect.NetworkChecker$NetType r2 = xyz.adscope.common.network.connect.NetworkChecker.NetType.Mobile
            boolean r2 = a(r2, r3)
            if (r2 != 0) goto L3a
            return r0
        L3a:
            xyz.adscope.common.network.connect.NetworkChecker$NetType r2 = xyz.adscope.common.network.connect.NetworkChecker.NetType.Mobile2G
            boolean r2 = b(r2, r3)
            return r2
        L41:
            boolean r2 = a(r3)
            if (r2 != 0) goto L48
            return r0
        L48:
            int r2 = r3.getType()
            if (r2 != 0) goto L4f
            return r1
        L4f:
            return r0
        L50:
            boolean r2 = a(r3)
            if (r2 != 0) goto L57
            return r0
        L57:
            int r2 = r3.getType()
            r3 = 9
            if (r2 != r3) goto L60
            return r1
        L60:
            return r0
        L61:
            boolean r2 = a(r3)
            if (r2 != 0) goto L68
            return r0
        L68:
            int r2 = r3.getType()
            if (r2 != r1) goto L6f
            return r1
        L6f:
            return r0
    }

    private static boolean b(xyz.adscope.common.network.connect.NetworkChecker.NetType r3, android.net.NetworkInfo r4) {
            int r0 = r4.getType()
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L39;
                case 2: goto L39;
                case 3: goto L33;
                case 4: goto L39;
                case 5: goto L33;
                case 6: goto L33;
                case 7: goto L39;
                case 8: goto L33;
                case 9: goto L33;
                case 10: goto L33;
                case 11: goto L39;
                case 12: goto L33;
                case 13: goto L2d;
                case 14: goto L33;
                case 15: goto L33;
                case 16: goto L39;
                case 17: goto L33;
                case 18: goto L2d;
                default: goto L9;
            }
        L9:
            java.lang.String r4 = r4.getSubtypeName()
            java.lang.String r0 = "TD-SCDMA"
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 != 0) goto L27
            java.lang.String r0 = "WCDMA"
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 != 0) goto L27
            java.lang.String r0 = "CDMA2000"
            boolean r4 = r4.equalsIgnoreCase(r0)
            if (r4 == 0) goto L26
            goto L27
        L26:
            return r2
        L27:
            xyz.adscope.common.network.connect.NetworkChecker$NetType r4 = xyz.adscope.common.network.connect.NetworkChecker.NetType.Mobile3G
            if (r3 != r4) goto L2c
            return r1
        L2c:
            return r2
        L2d:
            xyz.adscope.common.network.connect.NetworkChecker$NetType r4 = xyz.adscope.common.network.connect.NetworkChecker.NetType.Mobile4G
            if (r3 != r4) goto L32
            return r1
        L32:
            return r2
        L33:
            xyz.adscope.common.network.connect.NetworkChecker$NetType r4 = xyz.adscope.common.network.connect.NetworkChecker.NetType.Mobile3G
            if (r3 != r4) goto L38
            return r1
        L38:
            return r2
        L39:
            xyz.adscope.common.network.connect.NetworkChecker$NetType r4 = xyz.adscope.common.network.connect.NetworkChecker.NetType.Mobile2G
            if (r3 != r4) goto L3e
            return r1
        L3e:
            return r2
    }

    public boolean isAvailable() {
            r1 = this;
            boolean r0 = r1.isWifiConnected()
            if (r0 != 0) goto L15
            boolean r0 = r1.isWiredConnected()
            if (r0 != 0) goto L15
            boolean r0 = r1.isMobileConnected()
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }

    public final boolean isAvailable(xyz.adscope.common.network.connect.NetworkChecker.NetType r2) {
            r1 = this;
            android.net.ConnectivityManager r0 = r1.a
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            boolean r2 = a(r2, r0)
            return r2
    }

    public final boolean isMobile2GConnected() {
            r1 = this;
            xyz.adscope.common.network.connect.NetworkChecker$NetType r0 = xyz.adscope.common.network.connect.NetworkChecker.NetType.Mobile2G
            boolean r0 = r1.isAvailable(r0)
            return r0
    }

    public final boolean isMobile3GConnected() {
            r1 = this;
            xyz.adscope.common.network.connect.NetworkChecker$NetType r0 = xyz.adscope.common.network.connect.NetworkChecker.NetType.Mobile3G
            boolean r0 = r1.isAvailable(r0)
            return r0
    }

    public final boolean isMobile4GConnected() {
            r1 = this;
            xyz.adscope.common.network.connect.NetworkChecker$NetType r0 = xyz.adscope.common.network.connect.NetworkChecker.NetType.Mobile4G
            boolean r0 = r1.isAvailable(r0)
            return r0
    }

    public final boolean isMobileConnected() {
            r1 = this;
            xyz.adscope.common.network.connect.NetworkChecker$NetType r0 = xyz.adscope.common.network.connect.NetworkChecker.NetType.Mobile
            boolean r0 = r1.isAvailable(r0)
            return r0
    }

    public final boolean isWifiConnected() {
            r1 = this;
            xyz.adscope.common.network.connect.NetworkChecker$NetType r0 = xyz.adscope.common.network.connect.NetworkChecker.NetType.Wifi
            boolean r0 = r1.isAvailable(r0)
            return r0
    }

    public final boolean isWiredConnected() {
            r1 = this;
            xyz.adscope.common.network.connect.NetworkChecker$NetType r0 = xyz.adscope.common.network.connect.NetworkChecker.NetType.Wired
            boolean r0 = r1.isAvailable(r0)
            return r0
    }
}
