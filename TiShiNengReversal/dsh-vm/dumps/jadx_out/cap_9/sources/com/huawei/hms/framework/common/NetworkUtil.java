package com.huawei.hms.framework.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class NetworkUtil {
    public static final int UNAVAILABLE = Integer.MAX_VALUE;
    private static final java.lang.String a = "NetworkUtil";
    private static final int b = 13;
    private static final int c = -127;
    private static final java.lang.String d = "5G_NSA";
    private static final java.lang.String e = "5G_SA";
    public static volatile int networkTypeByReceiver;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class NetType {
        public static final int TYPE_2G = 2;
        public static final int TYPE_3G = 3;
        public static final int TYPE_4G = 4;
        public static final int TYPE_4G_NSA = 7;
        public static final int TYPE_5G = 5;
        public static final int TYPE_5G_SA = 8;
        public static final int TYPE_MOBILE = 6;
        public static final int TYPE_NO_NETWORK = -1;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WIFI = 1;

        public NetType() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class SignalType {
        public static final java.lang.String LTE_CQI = "lteCqi";
        public static final java.lang.String LTE_DBM = "lteDbm";
        public static final java.lang.String LTE_RSRP = "lteRsrp";
        public static final java.lang.String LTE_RSRQ = "lteRsrq";
        public static final java.lang.String LTE_RSSI = "lteRssi";
        public static final java.lang.String LTE_RSSNR = "lteRssnr";
        public static final java.lang.String NR_CSIRSRP = "nrCSIRsrp";
        public static final java.lang.String NR_CSIRSRQ = "nrCSIRsrq";
        public static final java.lang.String NR_CSISINR = "nrCSISinr";
        public static final java.lang.String NR_DBM = "nrDbm";
        public static final java.lang.String NR_SSRSRP = "nrSSRsrp";
        public static final java.lang.String NR_SSRSRQ = "nrSSRsrq";
        public static final java.lang.String NR_SSSINR = "nrSSSinr";

        public SignalType() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            return
    }

    public NetworkUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    private static java.lang.String[] a(android.content.Context r10) {
            java.lang.String r0 = "getActiveNetworkInfo failed, exception:"
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r2 = 0
            if (r10 == 0) goto L99
            java.lang.String r3 = "connectivity"
            java.lang.Object r10 = com.huawei.hms.framework.common.ContextCompat.getSystemService(r10, r3)
            android.net.ConnectivityManager r10 = (android.net.ConnectivityManager) r10
            if (r10 == 0) goto L99
            android.net.NetworkInfo r3 = r10.getActiveNetworkInfo()     // Catch: java.lang.RuntimeException -> L59 java.lang.SecurityException -> L5b
            if (r3 == 0) goto L99
            android.net.Network[] r4 = r10.getAllNetworks()     // Catch: java.lang.RuntimeException -> L59 java.lang.SecurityException -> L5b
            int r5 = r4.length     // Catch: java.lang.RuntimeException -> L59 java.lang.SecurityException -> L5b
            r6 = 0
        L20:
            if (r6 >= r5) goto L99
            r7 = r4[r6]     // Catch: java.lang.RuntimeException -> L59 java.lang.SecurityException -> L5b
            if (r7 != 0) goto L27
            goto L5d
        L27:
            android.net.NetworkInfo r8 = r10.getNetworkInfo(r7)     // Catch: java.lang.RuntimeException -> L59 java.lang.SecurityException -> L5b
            if (r8 == 0) goto L5d
            int r8 = r8.getType()     // Catch: java.lang.RuntimeException -> L59 java.lang.SecurityException -> L5b
            int r9 = r3.getType()     // Catch: java.lang.RuntimeException -> L59 java.lang.SecurityException -> L5b
            if (r8 != r9) goto L5d
            android.net.LinkProperties r7 = r10.getLinkProperties(r7)     // Catch: java.lang.RuntimeException -> L59 java.lang.SecurityException -> L5b
            if (r7 == 0) goto L5d
            java.util.List r7 = r7.getDnsServers()     // Catch: java.lang.RuntimeException -> L59 java.lang.SecurityException -> L5b
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.RuntimeException -> L59 java.lang.SecurityException -> L5b
        L45:
            boolean r8 = r7.hasNext()     // Catch: java.lang.RuntimeException -> L59 java.lang.SecurityException -> L5b
            if (r8 == 0) goto L5d
            java.lang.Object r8 = r7.next()     // Catch: java.lang.RuntimeException -> L59 java.lang.SecurityException -> L5b
            java.net.InetAddress r8 = (java.net.InetAddress) r8     // Catch: java.lang.RuntimeException -> L59 java.lang.SecurityException -> L5b
            java.lang.String r8 = r8.getHostAddress()     // Catch: java.lang.RuntimeException -> L59 java.lang.SecurityException -> L5b
            r1.add(r8)     // Catch: java.lang.RuntimeException -> L59 java.lang.SecurityException -> L5b
            goto L45
        L59:
            r10 = move-exception
            goto L60
        L5b:
            r10 = move-exception
            goto L7d
        L5d:
            int r6 = r6 + 1
            goto L20
        L60:
            java.lang.String r3 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getSimpleName()
            r4.append(r10)
            java.lang.String r10 = r4.toString()
            com.huawei.hms.framework.common.Logger.i(r3, r10)
            goto L99
        L7d:
            java.lang.String r3 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getSimpleName()
            r4.append(r10)
            java.lang.String r10 = r4.toString()
            com.huawei.hms.framework.common.Logger.i(r3, r10)
        L99:
            boolean r10 = r1.isEmpty()
            if (r10 == 0) goto La2
            java.lang.String[] r10 = new java.lang.String[r2]
            goto Lae
        La2:
            int r10 = r1.size()
            java.lang.String[] r10 = new java.lang.String[r10]
            java.lang.Object[] r10 = r1.toArray(r10)
            java.lang.String[] r10 = (java.lang.String[]) r10
        Lae:
            return r10
    }

    private static int b(android.content.Context r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r0 > r1) goto La
            return r2
        La:
            android.telephony.SignalStrength r0 = c(r4)
            if (r0 != 0) goto L11
            return r2
        L11:
            int r4 = getNetworkType(r4)
            r1 = 3
            r3 = 0
            if (r4 == r1) goto L55
            r1 = 4
            if (r4 == r1) goto L3e
            r1 = 5
            if (r4 == r1) goto L21
            goto L9e
        L21:
            java.lang.Class r4 = com.huawei.hms.framework.common.a.a()     // Catch: java.lang.Throwable -> L3c
            java.util.List r4 = com.huawei.hms.framework.common.n.a(r0, r4)     // Catch: java.lang.Throwable -> L3c
            int r0 = r4.size()     // Catch: java.lang.Throwable -> L3c
            if (r0 <= 0) goto L9e
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L3c
            android.telephony.CellSignalStrengthNr r4 = com.autonavi.aps.amapapi.restruct.t.a(r4)     // Catch: java.lang.Throwable -> L3c
            int r4 = com.huawei.hms.framework.common.o.a(r4)     // Catch: java.lang.Throwable -> L3c
            return r4
        L3c:
            r4 = move-exception
            goto L9f
        L3e:
            java.lang.Class<android.telephony.CellSignalStrengthLte> r4 = android.telephony.CellSignalStrengthLte.class
            java.util.List r4 = com.huawei.hms.framework.common.n.a(r0, r4)     // Catch: java.lang.Throwable -> L3c
            int r0 = r4.size()     // Catch: java.lang.Throwable -> L3c
            if (r0 <= 0) goto L9e
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L3c
            android.telephony.CellSignalStrengthLte r4 = (android.telephony.CellSignalStrengthLte) r4     // Catch: java.lang.Throwable -> L3c
            int r4 = r4.getDbm()     // Catch: java.lang.Throwable -> L3c
            return r4
        L55:
            java.lang.Class<android.telephony.CellSignalStrengthCdma> r4 = android.telephony.CellSignalStrengthCdma.class
            java.util.List r4 = com.huawei.hms.framework.common.n.a(r0, r4)     // Catch: java.lang.Throwable -> L3c
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L3c
            if (r1 <= 0) goto L6c
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L3c
            android.telephony.CellSignalStrengthCdma r4 = (android.telephony.CellSignalStrengthCdma) r4     // Catch: java.lang.Throwable -> L3c
            int r4 = r4.getDbm()     // Catch: java.lang.Throwable -> L3c
            return r4
        L6c:
            java.lang.Class r4 = com.huawei.hms.framework.common.g.a()     // Catch: java.lang.Throwable -> L3c
            java.util.List r4 = com.huawei.hms.framework.common.n.a(r0, r4)     // Catch: java.lang.Throwable -> L3c
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L3c
            if (r1 <= 0) goto L87
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L3c
            android.telephony.CellSignalStrengthTdscdma r4 = com.huawei.hms.framework.common.h.a(r4)     // Catch: java.lang.Throwable -> L3c
            int r4 = com.bytedance.sdk.openadsdk.core.rn.e.a(r4)     // Catch: java.lang.Throwable -> L3c
            return r4
        L87:
            java.lang.Class<android.telephony.CellSignalStrengthWcdma> r4 = android.telephony.CellSignalStrengthWcdma.class
            java.util.List r4 = com.huawei.hms.framework.common.n.a(r0, r4)     // Catch: java.lang.Throwable -> L3c
            int r0 = r4.size()     // Catch: java.lang.Throwable -> L3c
            if (r0 <= 0) goto L9e
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L3c
            android.telephony.CellSignalStrengthWcdma r4 = (android.telephony.CellSignalStrengthWcdma) r4     // Catch: java.lang.Throwable -> L3c
            int r4 = r4.getDbm()     // Catch: java.lang.Throwable -> L3c
            return r4
        L9e:
            return r2
        L9f:
            java.lang.String r0 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "getMobileSingalStrength: throwable:"
            r1.append(r3)
            java.lang.Class r4 = r4.getClass()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.huawei.hms.framework.common.Logger.i(r0, r4)
            return r2
    }

    private static android.telephony.SignalStrength c(android.content.Context r2) {
            if (r2 == 0) goto L11
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L11
            android.telephony.TelephonyManager r2 = getTrafficCardTelephonyManager(r2)
            android.telephony.SignalStrength r2 = com.huawei.hms.framework.common.j.a(r2)
            return r2
        L11:
            r2 = 0
            return r2
    }

    private static int d(int r1) {
            r0 = -1
            if (r1 == r0) goto L16
            r0 = 1
            if (r1 == r0) goto L16
            r0 = 2
            if (r1 == r0) goto L14
            r0 = 3
            if (r1 == r0) goto L14
            r0 = 4
            if (r1 == r0) goto L14
            r0 = 5
            if (r1 == r0) goto L14
            r1 = 0
            return r1
        L14:
            r1 = 6
            return r1
        L16:
            return r0
    }

    public static int getCurrentNetworkType() {
            int r0 = com.huawei.hms.framework.common.NetworkUtil.networkTypeByReceiver
            return r0
    }

    public static java.lang.String getDnsServerIps(android.content.Context r0) {
            java.lang.String[] r0 = a(r0)
            java.lang.String r0 = java.util.Arrays.toString(r0)
            return r0
    }

    public static java.lang.String getHost(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L9
            java.lang.String r1 = ""
            return r1
        L9:
            java.lang.String r1 = com.huawei.secure.android.common.webview.d.b(r1)
            return r1
    }

    public static int getInfoWithReflect(android.telephony.SignalStrength r3, java.lang.String r4) {
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L20 java.lang.reflect.InvocationTargetException -> L3f java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L6d
            r1 = 28
            if (r0 > r1) goto L83
            java.lang.Class<android.telephony.SignalStrength> r0 = android.telephony.SignalStrength.class
            r1 = 0
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r1)     // Catch: java.lang.Throwable -> L20 java.lang.reflect.InvocationTargetException -> L3f java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L6d
            com.huawei.hms.framework.common.NetworkUtil$1 r2 = new com.huawei.hms.framework.common.NetworkUtil$1     // Catch: java.lang.Throwable -> L20 java.lang.reflect.InvocationTargetException -> L3f java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L6d
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L20 java.lang.reflect.InvocationTargetException -> L3f java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L6d
            java.security.AccessController.doPrivileged(r2)     // Catch: java.lang.Throwable -> L20 java.lang.reflect.InvocationTargetException -> L3f java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L6d
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.Throwable -> L20 java.lang.reflect.InvocationTargetException -> L3f java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L6d
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L20 java.lang.reflect.InvocationTargetException -> L3f java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L6d
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L20 java.lang.reflect.InvocationTargetException -> L3f java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L6d
            return r3
        L20:
            r3 = move-exception
            java.lang.String r0 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r4 = " : throwable:"
            r1.append(r4)
            java.lang.Class r3 = r3.getClass()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            com.huawei.hms.framework.common.Logger.i(r0, r3)
            goto L83
        L3f:
            java.lang.String r3 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = " : InvocationTargetException"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            com.huawei.hms.framework.common.Logger.i(r3, r4)
            goto L83
        L56:
            java.lang.String r3 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = " : cannot access"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            com.huawei.hms.framework.common.Logger.i(r3, r4)
            goto L83
        L6d:
            java.lang.String r3 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = " : function not found"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            com.huawei.hms.framework.common.Logger.i(r3, r4)
        L83:
            r3 = 2147483647(0x7fffffff, float:NaN)
            return r3
    }

    public static int getLteCqi(android.content.Context r4) {
            android.telephony.SignalStrength r4 = c(r4)
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != 0) goto La
            goto L2a
        La:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L28
            r2 = 28
            if (r1 <= r2) goto L2b
            java.lang.Class<android.telephony.CellSignalStrengthLte> r1 = android.telephony.CellSignalStrengthLte.class
            java.util.List r4 = com.huawei.hms.framework.common.n.a(r4, r1)     // Catch: java.lang.Throwable -> L28
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L28
            if (r1 <= 0) goto L2a
            r1 = 0
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L28
            android.telephony.CellSignalStrengthLte r4 = (android.telephony.CellSignalStrengthLte) r4     // Catch: java.lang.Throwable -> L28
            int r4 = com.huawei.hms.framework.common.i.a(r4)     // Catch: java.lang.Throwable -> L28
            return r4
        L28:
            r4 = move-exception
            goto L32
        L2a:
            return r0
        L2b:
            java.lang.String r1 = "getLteCqi"
            int r4 = getInfoWithReflect(r4, r1)     // Catch: java.lang.Throwable -> L28
            return r4
        L32:
            java.lang.String r1 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getLteCqi: throwable:"
            r2.append(r3)
            java.lang.Class r4 = r4.getClass()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.huawei.hms.framework.common.Logger.i(r1, r4)
            return r0
    }

    public static int getLteRsrp(android.content.Context r4) {
            android.telephony.SignalStrength r4 = c(r4)
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != 0) goto La
            goto L2a
        La:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L28
            r2 = 28
            if (r1 <= r2) goto L2b
            java.lang.Class<android.telephony.CellSignalStrengthLte> r1 = android.telephony.CellSignalStrengthLte.class
            java.util.List r4 = com.huawei.hms.framework.common.n.a(r4, r1)     // Catch: java.lang.Throwable -> L28
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L28
            if (r1 <= 0) goto L2a
            r1 = 0
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L28
            android.telephony.CellSignalStrengthLte r4 = (android.telephony.CellSignalStrengthLte) r4     // Catch: java.lang.Throwable -> L28
            int r4 = com.huawei.hms.framework.common.t.a(r4)     // Catch: java.lang.Throwable -> L28
            return r4
        L28:
            r4 = move-exception
            goto L32
        L2a:
            return r0
        L2b:
            java.lang.String r1 = "getLteRsrp"
            int r4 = getInfoWithReflect(r4, r1)     // Catch: java.lang.Throwable -> L28
            return r4
        L32:
            java.lang.String r1 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getLteRsrp: throwable:"
            r2.append(r3)
            java.lang.Class r4 = r4.getClass()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.huawei.hms.framework.common.Logger.i(r1, r4)
            return r0
    }

    public static int getLteRsrq(android.content.Context r4) {
            android.telephony.SignalStrength r4 = c(r4)
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != 0) goto La
            goto L2a
        La:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L28
            r2 = 28
            if (r1 <= r2) goto L2b
            java.lang.Class<android.telephony.CellSignalStrengthLte> r1 = android.telephony.CellSignalStrengthLte.class
            java.util.List r4 = com.huawei.hms.framework.common.n.a(r4, r1)     // Catch: java.lang.Throwable -> L28
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L28
            if (r1 <= 0) goto L2a
            r1 = 0
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L28
            android.telephony.CellSignalStrengthLte r4 = (android.telephony.CellSignalStrengthLte) r4     // Catch: java.lang.Throwable -> L28
            int r4 = com.huawei.hms.framework.common.b.a(r4)     // Catch: java.lang.Throwable -> L28
            return r4
        L28:
            r4 = move-exception
            goto L32
        L2a:
            return r0
        L2b:
            java.lang.String r1 = "getLteRsrq"
            int r4 = getInfoWithReflect(r4, r1)     // Catch: java.lang.Throwable -> L28
            return r4
        L32:
            java.lang.String r1 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getLteRsrq: throwable:"
            r2.append(r3)
            java.lang.Class r4 = r4.getClass()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.huawei.hms.framework.common.Logger.i(r1, r4)
            return r0
    }

    public static int getLteRssi(android.content.Context r4) {
            android.telephony.SignalStrength r4 = c(r4)
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != 0) goto La
            goto L2a
        La:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L28
            r2 = 28
            if (r1 <= r2) goto L2a
            java.lang.Class<android.telephony.CellSignalStrengthLte> r1 = android.telephony.CellSignalStrengthLte.class
            java.util.List r4 = com.huawei.hms.framework.common.n.a(r4, r1)     // Catch: java.lang.Throwable -> L28
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L28
            if (r1 <= 0) goto L2a
            r1 = 0
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L28
            android.telephony.CellSignalStrengthLte r4 = (android.telephony.CellSignalStrengthLte) r4     // Catch: java.lang.Throwable -> L28
            int r4 = com.huawei.hms.framework.common.c.a(r4)     // Catch: java.lang.Throwable -> L28
            return r4
        L28:
            r4 = move-exception
            goto L2b
        L2a:
            return r0
        L2b:
            java.lang.String r1 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getLteRssi: throwable:"
            r2.append(r3)
            java.lang.Class r4 = r4.getClass()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.huawei.hms.framework.common.Logger.i(r1, r4)
            return r0
    }

    public static int getLteRssnr(android.content.Context r4) {
            android.telephony.SignalStrength r4 = c(r4)
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != 0) goto La
            goto L2a
        La:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L28
            r2 = 28
            if (r1 <= r2) goto L2b
            java.lang.Class<android.telephony.CellSignalStrengthLte> r1 = android.telephony.CellSignalStrengthLte.class
            java.util.List r4 = com.huawei.hms.framework.common.n.a(r4, r1)     // Catch: java.lang.Throwable -> L28
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L28
            if (r1 <= 0) goto L2a
            r1 = 0
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L28
            android.telephony.CellSignalStrengthLte r4 = (android.telephony.CellSignalStrengthLte) r4     // Catch: java.lang.Throwable -> L28
            int r4 = com.huawei.hms.framework.common.d.a(r4)     // Catch: java.lang.Throwable -> L28
            return r4
        L28:
            r4 = move-exception
            goto L32
        L2a:
            return r0
        L2b:
            java.lang.String r1 = "getLteRssnr"
            int r4 = getInfoWithReflect(r4, r1)     // Catch: java.lang.Throwable -> L28
            return r4
        L32:
            java.lang.String r1 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getLteRssnr: throwable:"
            r2.append(r3)
            java.lang.Class r4 = r4.getClass()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.huawei.hms.framework.common.Logger.i(r1, r4)
            return r0
    }

    public static java.util.Map<java.lang.String, java.lang.Integer> getLteSignalInfo(android.content.Context r8) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            android.telephony.SignalStrength r8 = c(r8)
            if (r8 != 0) goto Ld
            goto L95
        Ld:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L93
            r2 = 28
            java.lang.String r3 = "lteCqi"
            java.lang.String r4 = "lteRssnr"
            java.lang.String r5 = "lteRsrq"
            java.lang.String r6 = "lteRsrp"
            java.lang.String r7 = "lteDbm"
            if (r1 <= r2) goto L96
            java.lang.Class<android.telephony.CellSignalStrengthLte> r1 = android.telephony.CellSignalStrengthLte.class
            java.util.List r8 = com.huawei.hms.framework.common.n.a(r8, r1)     // Catch: java.lang.Throwable -> L93
            int r1 = r8.size()     // Catch: java.lang.Throwable -> L93
            if (r1 <= 0) goto L95
            r1 = 0
            java.lang.Object r2 = r8.get(r1)     // Catch: java.lang.Throwable -> L93
            android.telephony.CellSignalStrengthLte r2 = (android.telephony.CellSignalStrengthLte) r2     // Catch: java.lang.Throwable -> L93
            int r2 = r2.getDbm()     // Catch: java.lang.Throwable -> L93
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L93
            r0.put(r7, r2)     // Catch: java.lang.Throwable -> L93
            java.lang.Object r2 = r8.get(r1)     // Catch: java.lang.Throwable -> L93
            android.telephony.CellSignalStrengthLte r2 = (android.telephony.CellSignalStrengthLte) r2     // Catch: java.lang.Throwable -> L93
            int r2 = com.huawei.hms.framework.common.t.a(r2)     // Catch: java.lang.Throwable -> L93
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L93
            r0.put(r6, r2)     // Catch: java.lang.Throwable -> L93
            java.lang.Object r2 = r8.get(r1)     // Catch: java.lang.Throwable -> L93
            android.telephony.CellSignalStrengthLte r2 = (android.telephony.CellSignalStrengthLte) r2     // Catch: java.lang.Throwable -> L93
            int r2 = com.huawei.hms.framework.common.b.a(r2)     // Catch: java.lang.Throwable -> L93
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L93
            r0.put(r5, r2)     // Catch: java.lang.Throwable -> L93
            java.lang.Object r2 = r8.get(r1)     // Catch: java.lang.Throwable -> L93
            android.telephony.CellSignalStrengthLte r2 = (android.telephony.CellSignalStrengthLte) r2     // Catch: java.lang.Throwable -> L93
            int r2 = com.huawei.hms.framework.common.d.a(r2)     // Catch: java.lang.Throwable -> L93
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L93
            r0.put(r4, r2)     // Catch: java.lang.Throwable -> L93
            java.lang.Object r2 = r8.get(r1)     // Catch: java.lang.Throwable -> L93
            android.telephony.CellSignalStrengthLte r2 = (android.telephony.CellSignalStrengthLte) r2     // Catch: java.lang.Throwable -> L93
            int r2 = com.huawei.hms.framework.common.i.a(r2)     // Catch: java.lang.Throwable -> L93
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L93
            r0.put(r3, r2)     // Catch: java.lang.Throwable -> L93
            java.lang.String r2 = "lteRssi"
            java.lang.Object r8 = r8.get(r1)     // Catch: java.lang.Throwable -> L93
            android.telephony.CellSignalStrengthLte r8 = (android.telephony.CellSignalStrengthLte) r8     // Catch: java.lang.Throwable -> L93
            int r8 = com.huawei.hms.framework.common.c.a(r8)     // Catch: java.lang.Throwable -> L93
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L93
            r0.put(r2, r8)     // Catch: java.lang.Throwable -> L93
            return r0
        L93:
            r8 = move-exception
            goto Ld8
        L95:
            return r0
        L96:
            java.lang.String r1 = "getDbm"
            int r1 = getInfoWithReflect(r8, r1)     // Catch: java.lang.Throwable -> L93
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L93
            r0.put(r7, r1)     // Catch: java.lang.Throwable -> L93
            java.lang.String r1 = "getLteRsrp"
            int r1 = getInfoWithReflect(r8, r1)     // Catch: java.lang.Throwable -> L93
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L93
            r0.put(r6, r1)     // Catch: java.lang.Throwable -> L93
            java.lang.String r1 = "getLteRsrq"
            int r1 = getInfoWithReflect(r8, r1)     // Catch: java.lang.Throwable -> L93
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L93
            r0.put(r5, r1)     // Catch: java.lang.Throwable -> L93
            java.lang.String r1 = "getLteRssnr"
            int r1 = getInfoWithReflect(r8, r1)     // Catch: java.lang.Throwable -> L93
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L93
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L93
            java.lang.String r1 = "getLteCqi"
            int r8 = getInfoWithReflect(r8, r1)     // Catch: java.lang.Throwable -> L93
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L93
            r0.put(r3, r8)     // Catch: java.lang.Throwable -> L93
            return r0
        Ld8:
            java.lang.String r1 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getLteRssi: throwable:"
            r2.append(r3)
            java.lang.Class r8 = r8.getClass()
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            com.huawei.hms.framework.common.Logger.i(r1, r8)
            return r0
    }

    public static java.lang.String getMNC(android.content.Context r2) {
            java.lang.String r0 = "unknown"
            if (r2 != 0) goto L5
            goto Lb
        L5:
            boolean r1 = isSimReady(r2)
            if (r1 != 0) goto Lc
        Lb:
            return r0
        Lc:
            java.lang.String r1 = "phone"
            java.lang.Object r2 = com.huawei.hms.framework.common.ContextCompat.getSystemService(r2, r1)
            boolean r1 = r2 instanceof android.telephony.TelephonyManager
            if (r1 == 0) goto L19
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2
            goto L1a
        L19:
            r2 = 0
        L1a:
            if (r2 != 0) goto L24
            java.lang.String r2 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.String r1 = "getSubscriptionOperatorType: other error!"
            com.huawei.hms.framework.common.Logger.e(r2, r1)
            return r0
        L24:
            java.lang.String r2 = r2.getNetworkOperator()
            java.lang.String r0 = "46001"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L84
            java.lang.String r0 = "46006"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L84
            java.lang.String r0 = "46009"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L41
            goto L84
        L41:
            java.lang.String r0 = "46000"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L81
            java.lang.String r0 = "46002"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L81
            java.lang.String r0 = "46004"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L81
            java.lang.String r0 = "46007"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L62
            goto L81
        L62:
            java.lang.String r0 = "46003"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L7e
            java.lang.String r0 = "46005"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L7e
            java.lang.String r0 = "46011"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L7b
            goto L7e
        L7b:
            java.lang.String r2 = "other"
            return r2
        L7e:
            java.lang.String r2 = "China_Telecom"
            return r2
        L81:
            java.lang.String r2 = "China_Mobile"
            return r2
        L84:
            java.lang.String r2 = "China_Unicom"
            return r2
    }

    public static int getMobileRsrp(android.content.Context r4) {
            android.telephony.SignalStrength r0 = c(r4)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != 0) goto La
            return r1
        La:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L15
            r3 = 28
            if (r2 <= r3) goto L17
            int r4 = b(r4)     // Catch: java.lang.Throwable -> L15
            return r4
        L15:
            r4 = move-exception
            goto L1e
        L17:
            java.lang.String r4 = "getDbm"
            int r4 = getInfoWithReflect(r0, r4)     // Catch: java.lang.Throwable -> L15
            return r4
        L1e:
            java.lang.String r0 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getDbm: throwable:"
            r2.append(r3)
            java.lang.Class r4 = r4.getClass()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.huawei.hms.framework.common.Logger.i(r0, r4)
            return r1
    }

    public static java.lang.String getNetWorkNSAorSA() {
            android.telephony.HwTelephonyManager r0 = android.telephony.HwTelephonyManager.getDefault()     // Catch: java.lang.Throwable -> L3e
            int r1 = r0.getDefault4GSlotId()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = com.huawei.hms.framework.common.NetworkUtil.a     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r3.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = "phoneId "
            r3.append(r4)     // Catch: java.lang.Throwable -> L3e
            r3.append(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L3e
            com.huawei.hms.framework.common.Logger.v(r2, r3)     // Catch: java.lang.Throwable -> L3e
            boolean r0 = r0.isNsaState(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r1.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = "isNsa "
            r1.append(r3)     // Catch: java.lang.Throwable -> L3e
            r1.append(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L3e
            com.huawei.hms.framework.common.Logger.v(r2, r1)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L3b
            java.lang.String r0 = "5G_NSA"
            return r0
        L3b:
            java.lang.String r0 = "5G_SA"
            return r0
        L3e:
            java.lang.String r0 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.String r1 = "isNsaState error"
            com.huawei.hms.framework.common.Logger.v(r0, r1)
            r0 = 0
            return r0
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    public static android.net.NetworkInfo getNetworkInfo(android.content.Context r4) {
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = com.huawei.hms.framework.common.ContextCompat.checkSelfPermission(r4, r0)
            r1 = 0
            if (r0 == 0) goto L3e
            java.lang.String r0 = "connectivity"
            java.lang.Object r4 = com.huawei.hms.framework.common.ContextCompat.getSystemService(r4, r0)
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4
            if (r4 == 0) goto L3e
            android.net.NetworkInfo r4 = r4.getActiveNetworkInfo()     // Catch: java.lang.RuntimeException -> L18
            return r4
        L18:
            r4 = move-exception
            java.lang.String r0 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getActiveNetworkInfo failed, exception:"
            r2.append(r3)
            java.lang.Class r3 = r4.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.huawei.hms.framework.common.Logger.i(r0, r4)
        L3e:
            return r1
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    public static android.net.NetworkInfo.DetailedState getNetworkStatus(android.content.Context r4) {
            android.net.NetworkInfo$DetailedState r0 = android.net.NetworkInfo.DetailedState.IDLE
            if (r4 == 0) goto L5b
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = com.huawei.hms.framework.common.ContextCompat.getSystemService(r4, r1)
            boolean r2 = r1 instanceof android.net.ConnectivityManager
            if (r2 == 0) goto L54
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r4 = com.huawei.hms.framework.common.ContextCompat.checkSelfPermission(r4, r2)     // Catch: java.lang.RuntimeException -> L24
            if (r4 != 0) goto L17
            goto L5b
        L17:
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch: java.lang.RuntimeException -> L24
            android.net.NetworkInfo r4 = r1.getActiveNetworkInfo()     // Catch: java.lang.RuntimeException -> L24
            if (r4 == 0) goto L26
            android.net.NetworkInfo$DetailedState r4 = r4.getDetailedState()     // Catch: java.lang.RuntimeException -> L24
            return r4
        L24:
            r4 = move-exception
            goto L2e
        L26:
            java.lang.String r4 = com.huawei.hms.framework.common.NetworkUtil.a     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r1 = "getNetworkStatus networkIsConnected netInfo is null!"
            com.huawei.hms.framework.common.Logger.i(r4, r1)     // Catch: java.lang.RuntimeException -> L24
            return r0
        L2e:
            java.lang.String r1 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getNetworkStatus exception"
            r2.append(r3)
            java.lang.Class r3 = r4.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.huawei.hms.framework.common.Logger.i(r1, r4)
            goto L5b
        L54:
            java.lang.String r4 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.String r1 = "getNetworkStatus ConnectivityManager is null!"
            com.huawei.hms.framework.common.Logger.i(r4, r1)
        L5b:
            return r0
    }

    public static int getNetworkType(android.content.Context r1) {
            if (r1 == 0) goto Lb
            android.net.NetworkInfo r0 = getNetworkInfo(r1)
            int r1 = getNetworkType(r0, r1)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public static int getNetworkType(android.net.NetworkInfo r1) {
            r0 = 0
            int r1 = getNetworkType(r1, r0)
            return r1
    }

    public static int getNetworkType(android.net.NetworkInfo r5, android.content.Context r6) {
            if (r5 == 0) goto L5e
            boolean r6 = r5.isConnected()
            if (r6 == 0) goto L5e
            int r6 = r5.getType()
            r0 = 1
            if (r0 == r6) goto L5d
            r1 = 13
            if (r1 != r6) goto L14
            goto L5d
        L14:
            r0 = 0
            if (r6 != 0) goto L5d
            int r6 = r5.getSubtype()
            java.lang.String r1 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getHwNetworkType return is: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.huawei.hms.framework.common.Logger.v(r1, r2)
            if (r6 != 0) goto L37
            int r6 = r5.getSubtype()
        L37:
            r5 = 20
            r1 = 2
            r2 = 3
            if (r6 == r5) goto L48
            switch(r6) {
                case 1: goto L46;
                case 2: goto L46;
                case 3: goto L44;
                case 4: goto L46;
                case 5: goto L44;
                case 6: goto L44;
                case 7: goto L46;
                case 8: goto L44;
                case 9: goto L44;
                case 10: goto L44;
                case 11: goto L46;
                case 12: goto L44;
                case 13: goto L42;
                case 14: goto L44;
                case 15: goto L44;
                default: goto L40;
            }
        L40:
            r5 = 0
            goto L49
        L42:
            r5 = 4
            goto L49
        L44:
            r5 = 3
            goto L49
        L46:
            r5 = 2
            goto L49
        L48:
            r5 = 5
        L49:
            if (r5 != 0) goto L5c
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 25
            if (r3 < r4) goto L5c
            r5 = 16
            if (r6 == r5) goto L5b
            r5 = 17
            if (r6 == r5) goto L5a
            return r0
        L5a:
            return r2
        L5b:
            return r1
        L5c:
            return r5
        L5d:
            return r0
        L5e:
            r5 = -1
            return r5
    }

    public static int getNrCsiRsrp(android.content.Context r4) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2c
            r2 = 28
            if (r1 <= r2) goto L2e
            android.telephony.SignalStrength r4 = c(r4)     // Catch: java.lang.Throwable -> L2c
            if (r4 != 0) goto L10
            goto L2e
        L10:
            java.lang.Class r1 = com.huawei.hms.framework.common.a.a()     // Catch: java.lang.Throwable -> L2c
            java.util.List r4 = com.huawei.hms.framework.common.n.a(r4, r1)     // Catch: java.lang.Throwable -> L2c
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L2c
            if (r1 <= 0) goto L2e
            r1 = 0
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L2c
            android.telephony.CellSignalStrengthNr r4 = com.autonavi.aps.amapapi.restruct.t.a(r4)     // Catch: java.lang.Throwable -> L2c
            int r4 = com.huawei.hms.framework.common.p.a(r4)     // Catch: java.lang.Throwable -> L2c
            return r4
        L2c:
            r4 = move-exception
            goto L2f
        L2e:
            return r0
        L2f:
            java.lang.String r1 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getNrCsiRsrp: throwable:"
            r2.append(r3)
            java.lang.Class r4 = r4.getClass()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.huawei.hms.framework.common.Logger.i(r1, r4)
            return r0
    }

    public static int getNrCsiRsrq(android.content.Context r4) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2c
            r2 = 28
            if (r1 <= r2) goto L2e
            android.telephony.SignalStrength r4 = c(r4)     // Catch: java.lang.Throwable -> L2c
            if (r4 != 0) goto L10
            goto L2e
        L10:
            java.lang.Class r1 = com.huawei.hms.framework.common.a.a()     // Catch: java.lang.Throwable -> L2c
            java.util.List r4 = com.huawei.hms.framework.common.n.a(r4, r1)     // Catch: java.lang.Throwable -> L2c
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L2c
            if (r1 <= 0) goto L2e
            r1 = 0
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L2c
            android.telephony.CellSignalStrengthNr r4 = com.autonavi.aps.amapapi.restruct.t.a(r4)     // Catch: java.lang.Throwable -> L2c
            int r4 = com.huawei.hms.framework.common.q.a(r4)     // Catch: java.lang.Throwable -> L2c
            return r4
        L2c:
            r4 = move-exception
            goto L2f
        L2e:
            return r0
        L2f:
            java.lang.String r1 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getNrCsiRsrq: throwable:"
            r2.append(r3)
            java.lang.Class r4 = r4.getClass()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.huawei.hms.framework.common.Logger.i(r1, r4)
            return r0
    }

    public static int getNrCsiSinr(android.content.Context r4) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2c
            r2 = 28
            if (r1 <= r2) goto L2e
            android.telephony.SignalStrength r4 = c(r4)     // Catch: java.lang.Throwable -> L2c
            if (r4 != 0) goto L10
            goto L2e
        L10:
            java.lang.Class r1 = com.huawei.hms.framework.common.a.a()     // Catch: java.lang.Throwable -> L2c
            java.util.List r4 = com.huawei.hms.framework.common.n.a(r4, r1)     // Catch: java.lang.Throwable -> L2c
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L2c
            if (r1 <= 0) goto L2e
            r1 = 0
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L2c
            android.telephony.CellSignalStrengthNr r4 = com.autonavi.aps.amapapi.restruct.t.a(r4)     // Catch: java.lang.Throwable -> L2c
            int r4 = com.huawei.hms.framework.common.s.a(r4)     // Catch: java.lang.Throwable -> L2c
            return r4
        L2c:
            r4 = move-exception
            goto L2f
        L2e:
            return r0
        L2f:
            java.lang.String r1 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getNrCsiSinr: throwable:"
            r2.append(r3)
            java.lang.Class r4 = r4.getClass()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.huawei.hms.framework.common.Logger.i(r1, r4)
            return r0
    }

    public static java.util.Map<java.lang.String, java.lang.Integer> getNrSignalInfo(android.content.Context r4) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            android.telephony.SignalStrength r4 = c(r4)
            if (r4 != 0) goto Ld
            goto Lb8
        Ld:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lb6
            r2 = 28
            if (r1 <= r2) goto Lb8
            java.lang.Class r1 = com.huawei.hms.framework.common.a.a()     // Catch: java.lang.Throwable -> Lb6
            java.util.List r4 = com.huawei.hms.framework.common.n.a(r4, r1)     // Catch: java.lang.Throwable -> Lb6
            int r1 = r4.size()     // Catch: java.lang.Throwable -> Lb6
            if (r1 <= 0) goto Lb8
            java.lang.String r1 = "nrDbm"
            r2 = 0
            java.lang.Object r3 = r4.get(r2)     // Catch: java.lang.Throwable -> Lb6
            android.telephony.CellSignalStrengthNr r3 = com.autonavi.aps.amapapi.restruct.t.a(r3)     // Catch: java.lang.Throwable -> Lb6
            int r3 = com.huawei.hms.framework.common.o.a(r3)     // Catch: java.lang.Throwable -> Lb6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lb6
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r1 = "nrCSIRsrp"
            java.lang.Object r3 = r4.get(r2)     // Catch: java.lang.Throwable -> Lb6
            android.telephony.CellSignalStrengthNr r3 = com.autonavi.aps.amapapi.restruct.t.a(r3)     // Catch: java.lang.Throwable -> Lb6
            int r3 = com.huawei.hms.framework.common.p.a(r3)     // Catch: java.lang.Throwable -> Lb6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lb6
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r1 = "nrCSIRsrq"
            java.lang.Object r3 = r4.get(r2)     // Catch: java.lang.Throwable -> Lb6
            android.telephony.CellSignalStrengthNr r3 = com.autonavi.aps.amapapi.restruct.t.a(r3)     // Catch: java.lang.Throwable -> Lb6
            int r3 = com.huawei.hms.framework.common.q.a(r3)     // Catch: java.lang.Throwable -> Lb6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lb6
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r1 = "nrCSISinr"
            java.lang.Object r3 = r4.get(r2)     // Catch: java.lang.Throwable -> Lb6
            android.telephony.CellSignalStrengthNr r3 = com.autonavi.aps.amapapi.restruct.t.a(r3)     // Catch: java.lang.Throwable -> Lb6
            int r3 = com.huawei.hms.framework.common.s.a(r3)     // Catch: java.lang.Throwable -> Lb6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lb6
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r1 = "nrSSRsrp"
            java.lang.Object r3 = r4.get(r2)     // Catch: java.lang.Throwable -> Lb6
            android.telephony.CellSignalStrengthNr r3 = com.autonavi.aps.amapapi.restruct.t.a(r3)     // Catch: java.lang.Throwable -> Lb6
            int r3 = com.autonavi.aps.amapapi.restruct.u.a(r3)     // Catch: java.lang.Throwable -> Lb6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lb6
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r1 = "nrSSRsrq"
            java.lang.Object r3 = r4.get(r2)     // Catch: java.lang.Throwable -> Lb6
            android.telephony.CellSignalStrengthNr r3 = com.autonavi.aps.amapapi.restruct.t.a(r3)     // Catch: java.lang.Throwable -> Lb6
            int r3 = com.huawei.hms.framework.common.l.a(r3)     // Catch: java.lang.Throwable -> Lb6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lb6
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r1 = "nrSSSinr"
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> Lb6
            android.telephony.CellSignalStrengthNr r4 = com.autonavi.aps.amapapi.restruct.t.a(r4)     // Catch: java.lang.Throwable -> Lb6
            int r4 = com.huawei.hms.framework.common.m.a(r4)     // Catch: java.lang.Throwable -> Lb6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lb6
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> Lb6
            return r0
        Lb6:
            r4 = move-exception
            goto Lb9
        Lb8:
            return r0
        Lb9:
            java.lang.String r1 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getLteRssi: throwable:"
            r2.append(r3)
            java.lang.Class r4 = r4.getClass()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.huawei.hms.framework.common.Logger.i(r1, r4)
            return r0
    }

    public static int getNrSsRsrp(android.content.Context r4) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2c
            r2 = 28
            if (r1 <= r2) goto L2e
            android.telephony.SignalStrength r4 = c(r4)     // Catch: java.lang.Throwable -> L2c
            if (r4 != 0) goto L10
            goto L2e
        L10:
            java.lang.Class r1 = com.huawei.hms.framework.common.a.a()     // Catch: java.lang.Throwable -> L2c
            java.util.List r4 = com.huawei.hms.framework.common.n.a(r4, r1)     // Catch: java.lang.Throwable -> L2c
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L2c
            if (r1 <= 0) goto L2e
            r1 = 0
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L2c
            android.telephony.CellSignalStrengthNr r4 = com.autonavi.aps.amapapi.restruct.t.a(r4)     // Catch: java.lang.Throwable -> L2c
            int r4 = com.autonavi.aps.amapapi.restruct.u.a(r4)     // Catch: java.lang.Throwable -> L2c
            return r4
        L2c:
            r4 = move-exception
            goto L2f
        L2e:
            return r0
        L2f:
            java.lang.String r1 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getNrSsRsrp: throwable:"
            r2.append(r3)
            java.lang.Class r4 = r4.getClass()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.huawei.hms.framework.common.Logger.i(r1, r4)
            return r0
    }

    public static int getNrSsRsrq(android.content.Context r4) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2c
            r2 = 28
            if (r1 <= r2) goto L2e
            android.telephony.SignalStrength r4 = c(r4)     // Catch: java.lang.Throwable -> L2c
            if (r4 != 0) goto L10
            goto L2e
        L10:
            java.lang.Class r1 = com.huawei.hms.framework.common.a.a()     // Catch: java.lang.Throwable -> L2c
            java.util.List r4 = com.huawei.hms.framework.common.n.a(r4, r1)     // Catch: java.lang.Throwable -> L2c
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L2c
            if (r1 <= 0) goto L2e
            r1 = 0
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L2c
            android.telephony.CellSignalStrengthNr r4 = com.autonavi.aps.amapapi.restruct.t.a(r4)     // Catch: java.lang.Throwable -> L2c
            int r4 = com.huawei.hms.framework.common.l.a(r4)     // Catch: java.lang.Throwable -> L2c
            return r4
        L2c:
            r4 = move-exception
            goto L2f
        L2e:
            return r0
        L2f:
            java.lang.String r1 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getNrSsRsrq: throwable:"
            r2.append(r3)
            java.lang.Class r4 = r4.getClass()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.huawei.hms.framework.common.Logger.i(r1, r4)
            return r0
    }

    public static int getNrSsSinr(android.content.Context r4) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2c
            r2 = 28
            if (r1 <= r2) goto L2e
            android.telephony.SignalStrength r4 = c(r4)     // Catch: java.lang.Throwable -> L2c
            if (r4 != 0) goto L10
            goto L2e
        L10:
            java.lang.Class r1 = com.huawei.hms.framework.common.a.a()     // Catch: java.lang.Throwable -> L2c
            java.util.List r4 = com.huawei.hms.framework.common.n.a(r4, r1)     // Catch: java.lang.Throwable -> L2c
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L2c
            if (r1 <= 0) goto L2e
            r1 = 0
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L2c
            android.telephony.CellSignalStrengthNr r4 = com.autonavi.aps.amapapi.restruct.t.a(r4)     // Catch: java.lang.Throwable -> L2c
            int r4 = com.huawei.hms.framework.common.m.a(r4)     // Catch: java.lang.Throwable -> L2c
            return r4
        L2c:
            r4 = move-exception
            goto L2f
        L2e:
            return r0
        L2f:
            java.lang.String r1 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getNrSsSinr: throwable:"
            r2.append(r3)
            java.lang.Class r4 = r4.getClass()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.huawei.hms.framework.common.Logger.i(r1, r4)
            return r0
    }

    public static int getPrimaryNetworkType(android.content.Context r1) {
            android.net.NetworkInfo r0 = getNetworkInfo(r1)
            int r1 = getNetworkType(r0, r1)
            int r1 = d(r1)
            return r1
    }

    public static int getPrimaryNetworkType(android.net.NetworkInfo r0) {
            int r0 = getNetworkType(r0)
            int r0 = d(r0)
            return r0
    }

    public static android.telephony.TelephonyManager getTrafficCardTelephonyManager(android.content.Context r2) {
            if (r2 == 0) goto L1d
            java.lang.String r0 = "phone"
            java.lang.Object r2 = com.huawei.hms.framework.common.ContextCompat.getSystemService(r2, r0)
            boolean r0 = r2 instanceof android.telephony.TelephonyManager
            if (r0 == 0) goto L1d
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L1c
            int r0 = com.bytedance.sdk.openadsdk.l.k.a()
            android.telephony.TelephonyManager r2 = com.huawei.hms.framework.common.k.a(r2, r0)
        L1c:
            return r2
        L1d:
            r2 = 0
            return r2
    }

    public static java.lang.String getWifiGatewayIp(android.content.Context r6) {
            java.lang.String r0 = " "
            if (r6 == 0) goto L70
            android.content.Context r6 = r6.getApplicationContext()
            android.content.Context r6 = com.stub.StubApp.getOrigApplicationContext(r6)
            java.lang.String r1 = "wifi"
            java.lang.Object r6 = com.huawei.hms.framework.common.ContextCompat.getSystemService(r6, r1)
            boolean r1 = r6 instanceof android.net.wifi.WifiManager
            if (r1 == 0) goto L70
            android.net.wifi.WifiManager r6 = (android.net.wifi.WifiManager) r6
            android.net.DhcpInfo r6 = r6.getDhcpInfo()     // Catch: java.net.UnknownHostException -> L48 java.lang.RuntimeException -> L4a
            int r6 = r6.gateway     // Catch: java.net.UnknownHostException -> L48 java.lang.RuntimeException -> L4a
            r1 = r6 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1     // Catch: java.net.UnknownHostException -> L48 java.lang.RuntimeException -> L4a
            int r2 = r6 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2     // Catch: java.net.UnknownHostException -> L48 java.lang.RuntimeException -> L4a
            int r3 = r6 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.net.UnknownHostException -> L48 java.lang.RuntimeException -> L4a
            int r6 = r6 >> 24
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6     // Catch: java.net.UnknownHostException -> L48 java.lang.RuntimeException -> L4a
            r4 = 4
            byte[] r4 = new byte[r4]     // Catch: java.net.UnknownHostException -> L48 java.lang.RuntimeException -> L4a
            r5 = 0
            r4[r5] = r1     // Catch: java.net.UnknownHostException -> L48 java.lang.RuntimeException -> L4a
            r1 = 1
            r4[r1] = r2     // Catch: java.net.UnknownHostException -> L48 java.lang.RuntimeException -> L4a
            r1 = 2
            r4[r1] = r3     // Catch: java.net.UnknownHostException -> L48 java.lang.RuntimeException -> L4a
            r1 = 3
            r4[r1] = r6     // Catch: java.net.UnknownHostException -> L48 java.lang.RuntimeException -> L4a
            java.net.InetAddress r6 = java.net.InetAddress.getByAddress(r4)     // Catch: java.net.UnknownHostException -> L48 java.lang.RuntimeException -> L4a
            java.lang.String r6 = r6.getHostAddress()     // Catch: java.net.UnknownHostException -> L48 java.lang.RuntimeException -> L4a
            return r6
        L48:
            r6 = move-exception
            goto L4b
        L4a:
            r6 = move-exception
        L4b:
            java.lang.String r1 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getWifiGatewayIp error!"
            r2.append(r3)
            java.lang.Class r3 = r6.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            java.lang.String r6 = r6.getMessage()
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            com.huawei.hms.framework.common.Logger.i(r1, r6)
        L70:
            return r0
    }

    public static int getWifiRssi(android.content.Context r6) {
            r0 = -127(0xffffffffffffff81, float:NaN)
            if (r6 == 0) goto L6d
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r1 < r2) goto L6d
            android.content.Context r6 = r6.getApplicationContext()     // Catch: java.lang.RuntimeException -> L42
            android.content.Context r6 = com.stub.StubApp.getOrigApplicationContext(r6)     // Catch: java.lang.RuntimeException -> L42
            java.lang.String r1 = "connectivity"
            java.lang.Object r6 = r6.getSystemService(r1)     // Catch: java.lang.RuntimeException -> L42
            android.net.ConnectivityManager r6 = (android.net.ConnectivityManager) r6     // Catch: java.lang.RuntimeException -> L42
            android.net.Network[] r1 = r6.getAllNetworks()     // Catch: java.lang.RuntimeException -> L42
            int r2 = r1.length     // Catch: java.lang.RuntimeException -> L42
            r3 = 0
        L20:
            if (r3 >= r2) goto L47
            r4 = r1[r3]     // Catch: java.lang.RuntimeException -> L42
            android.net.NetworkCapabilities r4 = r6.getNetworkCapabilities(r4)     // Catch: java.lang.RuntimeException -> L42
            if (r4 == 0) goto L44
            r5 = 1
            boolean r5 = r4.hasTransport(r5)     // Catch: java.lang.RuntimeException -> L42
            if (r5 == 0) goto L44
            android.net.TransportInfo r4 = com.huawei.hms.framework.common.u.a(r4)     // Catch: java.lang.RuntimeException -> L42
            if (r4 == 0) goto L44
            boolean r5 = r4 instanceof android.net.wifi.WifiInfo     // Catch: java.lang.RuntimeException -> L42
            if (r5 == 0) goto L44
            android.net.wifi.WifiInfo r4 = (android.net.wifi.WifiInfo) r4     // Catch: java.lang.RuntimeException -> L42
            int r0 = r4.getRssi()     // Catch: java.lang.RuntimeException -> L42
            goto L44
        L42:
            r6 = move-exception
            goto L48
        L44:
            int r3 = r3 + 1
            goto L20
        L47:
            return r0
        L48:
            java.lang.String r1 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getWifiRssiLevel did not has permission!"
            r2.append(r3)
            java.lang.Class r3 = r6.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            java.lang.String r6 = r6.getMessage()
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            com.huawei.hms.framework.common.Logger.i(r1, r6)
        L6d:
            return r0
    }

    public static int getWifiRssiLevel(android.content.Context r1) {
            int r1 = getWifiRssi(r1)
            r0 = 5
            int r1 = android.net.wifi.WifiManager.calculateSignalLevel(r1, r0)
            return r1
    }

    public static boolean isChangeToConnected(android.net.NetworkInfo r0, android.net.NetworkInfo r1) {
            if (r0 == 0) goto L8
            boolean r0 = r0.isConnected()
            if (r0 != 0) goto L17
        L8:
            boolean r0 = r1.isConnected()
            if (r0 == 0) goto L17
            java.lang.String r0 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.String r1 = "Find network state changed to connected"
            com.huawei.hms.framework.common.Logger.v(r0, r1)
            r0 = 1
            return r0
        L17:
            r0 = 0
            return r0
    }

    public static boolean isConnectTypeChange(android.net.NetworkInfo r1, android.net.NetworkInfo r2) {
            if (r1 == 0) goto L21
            boolean r0 = r1.isConnected()
            if (r0 == 0) goto L21
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L21
            int r1 = getPrimaryNetworkType(r1)
            int r2 = getPrimaryNetworkType(r2)
            if (r1 == r2) goto L21
            java.lang.String r1 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.String r2 = "Find activity network changed"
            com.huawei.hms.framework.common.Logger.v(r1, r2)
            r1 = 1
            return r1
        L21:
            r1 = 0
            return r1
    }

    public static boolean isForeground() {
            com.huawei.hms.framework.common.ActivityUtil r0 = com.huawei.hms.framework.common.ActivityUtil.getInstance()
            boolean r0 = r0.isForeground()
            return r0
    }

    @java.lang.Deprecated
    public static boolean isForeground(android.content.Context r0) {
            boolean r0 = com.huawei.hms.framework.common.ActivityUtil.isForeground(r0)
            return r0
    }

    public static boolean isNetworkAvailable(android.content.Context r2) {
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = com.huawei.hms.framework.common.ContextCompat.checkSelfPermission(r2, r0)
            r1 = 1
            if (r0 == 0) goto L18
            android.net.NetworkInfo r2 = getNetworkInfo(r2)
            if (r2 == 0) goto L16
            boolean r2 = r2.isConnected()
            if (r2 == 0) goto L16
            return r1
        L16:
            r2 = 0
            return r2
        L18:
            return r1
    }

    public static boolean isSimReady(android.content.Context r1) {
            java.lang.String r0 = "phone"
            java.lang.Object r1 = com.huawei.hms.framework.common.ContextCompat.getSystemService(r1, r0)
            boolean r0 = r1 instanceof android.telephony.TelephonyManager
            if (r0 == 0) goto Ld
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            goto Le
        Ld:
            r1 = 0
        Le:
            if (r1 == 0) goto L19
            int r1 = r1.getSimState()
            r0 = 5
            if (r1 != r0) goto L19
            r1 = 1
            return r1
        L19:
            r1 = 0
            return r1
    }

    public static boolean isUserUnlocked(android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L1d
            java.lang.String r0 = "user"
            java.lang.Object r2 = com.huawei.hms.framework.common.ContextCompat.getSystemService(r2, r0)
            android.os.UserManager r2 = (android.os.UserManager) r2
            if (r2 == 0) goto L1d
            boolean r2 = com.huawei.hms.framework.common.f.a(r2)     // Catch: java.lang.RuntimeException -> L15
            return r2
        L15:
            r2 = move-exception
            java.lang.String r0 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.String r1 = "dealType rethrowFromSystemServer:"
            com.huawei.hms.framework.common.Logger.e(r0, r1, r2)
        L1d:
            r2 = 1
            return r2
    }

    public static int netWork(android.content.Context r3) {
            int r3 = getNetworkType(r3)
            java.lang.String r0 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "networkType "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.huawei.hms.framework.common.Logger.v(r0, r1)
            r0 = 4
            if (r3 != r0) goto L2b
            java.lang.String r0 = "5G_NSA"
            java.lang.String r1 = getNetWorkNSAorSA()
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L3c
            r3 = 7
            return r3
        L2b:
            r0 = 5
            if (r3 != r0) goto L3c
            java.lang.String r0 = "5G_SA"
            java.lang.String r1 = getNetWorkNSAorSA()
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L3c
            r3 = 8
        L3c:
            return r3
    }

    @java.lang.Deprecated
    public static android.net.NetworkInfo.DetailedState networkStatus(android.content.Context r0) {
            android.net.NetworkInfo$DetailedState r0 = getNetworkStatus(r0)
            return r0
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    public static int readDataSaverMode(android.content.Context r3) {
            r0 = 0
            if (r3 == 0) goto L39
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r1 < r2) goto L39
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = com.huawei.hms.framework.common.ContextCompat.checkSelfPermission(r3, r1)
            if (r1 == 0) goto L39
            java.lang.String r1 = "connectivity"
            java.lang.Object r3 = com.huawei.hms.framework.common.ContextCompat.getSystemService(r3, r1)
            boolean r1 = r3 instanceof android.net.ConnectivityManager
            if (r1 == 0) goto L39
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3
            boolean r1 = r3.isActiveNetworkMetered()     // Catch: java.lang.RuntimeException -> L28
            if (r1 == 0) goto L2a
            int r3 = com.huawei.hms.framework.common.e.a(r3)     // Catch: java.lang.RuntimeException -> L28
            return r3
        L28:
            r3 = move-exception
            goto L32
        L2a:
            java.lang.String r3 = com.huawei.hms.framework.common.NetworkUtil.a     // Catch: java.lang.RuntimeException -> L28
            java.lang.String r1 = "ConnectType is not Mobile Network!"
            com.huawei.hms.framework.common.Logger.v(r3, r1)     // Catch: java.lang.RuntimeException -> L28
            return r0
        L32:
            java.lang.String r1 = com.huawei.hms.framework.common.NetworkUtil.a
            java.lang.String r2 = "SystemServer error:"
            com.huawei.hms.framework.common.Logger.e(r1, r2, r3)
        L39:
            return r0
    }

    public static void updateCurrentNetworkType() {
            android.content.Context r0 = com.huawei.hms.framework.common.ContextHolder.getResourceContext()
            int r0 = netWork(r0)
            com.huawei.hms.framework.common.NetworkUtil.networkTypeByReceiver = r0
            return
    }
}
