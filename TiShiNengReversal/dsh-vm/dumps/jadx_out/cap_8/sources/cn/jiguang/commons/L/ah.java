package cn.jiguang.commons.L;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class ah {
    private static android.net.wifi.WifiManager a;

    class a implements java.util.Comparator {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public int a(android.net.wifi.ScanResult r1, android.net.wifi.ScanResult r2) {
                r0 = this;
                int r2 = r2.level
                int r1 = r1.level
                int r2 = r2 - r1
                return r2
        }

        @Override // java.util.Comparator
        public /* synthetic */ int compare(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                android.net.wifi.ScanResult r1 = (android.net.wifi.ScanResult) r1
                android.net.wifi.ScanResult r2 = (android.net.wifi.ScanResult) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    public ah() {
            r1 = this;
            r1.<init>()
            return
    }

    public static android.net.DhcpInfo a() {
            android.net.wifi.WifiManager r0 = u()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.net.DhcpInfo r0 = r0.getDhcpInfo()     // Catch: java.lang.Exception -> Ld
            return r0
        Ld:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "dhcp:err:"
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "WifiUtils"
            cn.jiguang.commons.w.a.f(r2, r0)
            return r1
    }

    public static java.lang.String a(int r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 15
            r0.<init>(r1)
            r1 = r3 & 255(0xff, float:3.57E-43)
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            int r2 = r3 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            r0.append(r2)
            r0.append(r1)
            int r2 = r3 >> 16
            r2 = r2 & 255(0xff, float:3.57E-43)
            r0.append(r2)
            r0.append(r1)
            int r3 = r3 >> 24
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "0.0.0.0"
            boolean r0 = android.text.TextUtils.equals(r3, r0)
            if (r0 == 0) goto L3a
            java.lang.String r3 = ""
        L3a:
            return r3
    }

    private static java.util.List a(java.util.List r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r7 = r7.iterator()
        Le:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L8a
            java.lang.Object r2 = r7.next()
            android.net.wifi.ScanResult r2 = (android.net.wifi.ScanResult) r2
            if (r2 != 0) goto L1d
            goto Le
        L1d:
            java.lang.String r3 = r2.SSID
            if (r3 == 0) goto Le
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto Le
            java.lang.String r3 = r2.SSID
            java.lang.String r4 = "<unknown ssid>"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L32
            goto Le
        L32:
            java.lang.String r3 = r2.BSSID
            if (r3 == 0) goto Le
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L3d
            goto Le
        L3d:
            java.lang.String r3 = r2.BSSID
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L69
            r3 = 0
        L46:
            int r4 = r0.size()
            if (r3 >= r4) goto Le
            java.lang.Object r4 = r0.get(r3)
            android.net.wifi.ScanResult r4 = (android.net.wifi.ScanResult) r4
            java.lang.String r5 = r2.BSSID
            java.lang.String r6 = r4.BSSID
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L66
            int r5 = r2.level
            int r4 = r4.level
            if (r5 <= r4) goto Le
            r0.set(r3, r2)
            goto Le
        L66:
            int r3 = r3 + 1
            goto L46
        L69:
            int r3 = r2.level
            r4 = -100
            java.lang.String r5 = "WifiUtils"
            if (r3 < r4) goto L87
            if (r3 <= 0) goto L74
            goto L87
        L74:
            int r3 = r2.frequency
            if (r3 > 0) goto L7e
            java.lang.String r2 = "scan:filter:invalid_freq"
        L7a:
            cn.jiguang.commons.w.a.a(r5, r2)
            goto Le
        L7e:
            r0.add(r2)
            java.lang.String r2 = r2.BSSID
            r1.add(r2)
            goto Le
        L87:
            java.lang.String r2 = "scan:filter:invalid_signal"
            goto L7a
        L8a:
            return r0
    }

    public static android.net.DhcpInfo c() {
            android.net.wifi.WifiManager r0 = u()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            cn.jiguang.commons.g.n r0 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> L17
            java.lang.Class<android.net.DhcpInfo> r2 = android.net.DhcpInfo.class
            r3 = 1602(0x642, float:2.245E-42)
            java.lang.Object r0 = r0.a(r2, r3)     // Catch: java.lang.Exception -> L17
            android.net.DhcpInfo r0 = (android.net.DhcpInfo) r0     // Catch: java.lang.Exception -> L17
            return r0
        L17:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "dhcp:err:"
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "WifiUtils"
            cn.jiguang.commons.w.a.f(r2, r0)
            return r1
    }

    private static void c(java.util.List r2) {
            cn.jiguang.commons.L.ah$a r0 = new cn.jiguang.commons.L.ah$a     // Catch: java.lang.Exception -> L9
            r0.<init>()     // Catch: java.lang.Exception -> L9
            java.util.Collections.sort(r2, r0)     // Catch: java.lang.Exception -> L9
            return
        L9:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "scan:err:sort:"
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "WifiUtils"
            cn.jiguang.commons.w.a.f(r0, r2)
            return
    }

    public static java.lang.String d() {
            android.net.DhcpInfo r0 = c()
            if (r0 == 0) goto Ld
            int r0 = r0.dns1
            java.lang.String r0 = a(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public static java.lang.String e() {
            android.net.DhcpInfo r0 = c()
            if (r0 == 0) goto Ld
            int r0 = r0.dns2
            java.lang.String r0 = a(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public static java.lang.String f() {
            android.net.DhcpInfo r0 = c()
            if (r0 == 0) goto Ld
            int r0 = r0.gateway
            java.lang.String r0 = a(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public static int g() {
            android.net.DhcpInfo r0 = c()
            if (r0 == 0) goto L9
            int r0 = r0.ipAddress
            return r0
        L9:
            r0 = -1
            return r0
    }

    public static java.lang.String h() {
            boolean r0 = cn.jiguang.commons.L.g.e()     // Catch: java.lang.Throwable -> Lb4
            boolean r1 = cn.jiguang.commons.L.g.g()     // Catch: java.lang.Throwable -> Lb4
            if (r0 != 0) goto Le
            if (r1 != 0) goto Le
            goto Lcf
        Le:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb4
            r2.<init>()     // Catch: java.lang.Throwable -> Lb4
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb4
            r3.<init>()     // Catch: java.lang.Throwable -> Lb4
            java.util.Enumeration r4 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Throwable -> Lb4
            java.util.ArrayList r4 = java.util.Collections.list(r4)     // Catch: java.lang.Throwable -> Lb4
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> Lb4
        L24:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> Lb4
            if (r5 == 0) goto L98
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> Lb4
            java.net.NetworkInterface r5 = (java.net.NetworkInterface) r5     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r6 = r6.toLowerCase()     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto L4a
            java.lang.String r7 = "rmnet"
            boolean r7 = r6.contains(r7)     // Catch: java.lang.Throwable -> Lb4
            if (r7 != 0) goto L55
            java.lang.String r7 = "ccmni"
            boolean r7 = r6.contains(r7)     // Catch: java.lang.Throwable -> Lb4
            if (r7 != 0) goto L55
        L4a:
            if (r1 == 0) goto L24
            java.lang.String r7 = "wlan0"
            boolean r6 = r6.contains(r7)     // Catch: java.lang.Throwable -> Lb4
            if (r6 == 0) goto L24
        L55:
            java.util.List r5 = r5.getInterfaceAddresses()     // Catch: java.lang.Throwable -> Lb4
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb4
            r6.<init>()     // Catch: java.lang.Throwable -> Lb4
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> Lb4
            r7 = 0
        L63:
            boolean r8 = r5.hasNext()     // Catch: java.lang.Throwable -> Lb4
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r5.next()     // Catch: java.lang.Throwable -> Lb4
            java.net.InterfaceAddress r8 = (java.net.InterfaceAddress) r8     // Catch: java.lang.Throwable -> Lb4
            java.net.InetAddress r8 = r8.getAddress()     // Catch: java.lang.Throwable -> Lb4
            boolean r9 = r8.isLoopbackAddress()     // Catch: java.lang.Throwable -> Lb4
            if (r9 != 0) goto L63
            boolean r9 = r8 instanceof java.net.Inet6Address     // Catch: java.lang.Throwable -> Lb4
            if (r9 == 0) goto L85
            java.lang.String r8 = r8.getHostAddress()     // Catch: java.lang.Throwable -> Lb4
            r6.add(r8)     // Catch: java.lang.Throwable -> Lb4
            goto L63
        L85:
            boolean r8 = r8 instanceof java.net.Inet4Address     // Catch: java.lang.Throwable -> Lb4
            if (r8 == 0) goto L63
            r7 = 1
            goto L63
        L8b:
            if (r7 == 0) goto L24
            if (r0 == 0) goto L92
            r2.addAll(r6)     // Catch: java.lang.Throwable -> Lb4
        L92:
            if (r1 == 0) goto L24
            r3.addAll(r6)     // Catch: java.lang.Throwable -> Lb4
            goto L24
        L98:
            java.lang.String r4 = "&"
            if (r0 == 0) goto La7
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lb4
            if (r0 != 0) goto La7
            java.lang.String r0 = android.text.TextUtils.join(r4, r2)     // Catch: java.lang.Throwable -> Lb4
            return r0
        La7:
            if (r1 == 0) goto Lcf
            boolean r0 = r3.isEmpty()     // Catch: java.lang.Throwable -> Lb4
            if (r0 != 0) goto Lcf
            java.lang.String r0 = android.text.TextUtils.join(r4, r3)     // Catch: java.lang.Throwable -> Lb4
            return r0
        Lb4:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ipv6:err:"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "WifiUtils"
            cn.jiguang.commons.w.a.f(r1, r0)
        Lcf:
            r0 = 0
            return r0
    }

    public static java.lang.String i() {
            java.lang.String r0 = k()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Le
            java.lang.String r0 = j()
        Le:
            boolean r1 = cn.jiguang.commons.L.ad.g(r0)
            if (r1 != 0) goto L16
            java.lang.String r0 = ""
        L16:
            return r0
    }

    public static java.lang.String j() {
            r0 = 0
            java.util.List r1 = l()     // Catch: java.lang.Exception -> L54
            if (r1 == 0) goto L68
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Exception -> L54
            if (r2 == 0) goto Le
            goto L68
        Le:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L54
        L12:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L54
            if (r2 == 0) goto L83
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L54
            java.net.NetworkInterface r2 = (java.net.NetworkInterface) r2     // Catch: java.lang.Exception -> L54
            java.lang.String r3 = r2.getName()     // Catch: java.lang.Exception -> L54
            java.lang.String r4 = "wlan0"
            boolean r3 = r3.equalsIgnoreCase(r4)     // Catch: java.lang.Exception -> L54
            if (r3 != 0) goto L2c
            goto L12
        L2c:
            byte[] r1 = r2.getHardwareAddress()     // Catch: java.lang.Exception -> L54
            if (r1 != 0) goto L33
            return r0
        L33:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L54
            r2.<init>()     // Catch: java.lang.Exception -> L54
            int r3 = r1.length     // Catch: java.lang.Exception -> L54
            r4 = 0
            r5 = 0
        L3b:
            r6 = 1
            if (r5 >= r3) goto L56
            r7 = r1[r5]     // Catch: java.lang.Exception -> L54
            java.lang.String r8 = "%02X:"
            java.lang.Byte r7 = java.lang.Byte.valueOf(r7)     // Catch: java.lang.Exception -> L54
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L54
            r6[r4] = r7     // Catch: java.lang.Exception -> L54
            java.lang.String r6 = java.lang.String.format(r8, r6)     // Catch: java.lang.Exception -> L54
            r2.append(r6)     // Catch: java.lang.Exception -> L54
            int r5 = r5 + 1
            goto L3b
        L54:
            r1 = move-exception
            goto L69
        L56:
            int r1 = r2.length()     // Catch: java.lang.Exception -> L54
            if (r1 <= 0) goto L64
            int r1 = r2.length()     // Catch: java.lang.Exception -> L54
            int r1 = r1 - r6
            r2.deleteCharAt(r1)     // Catch: java.lang.Exception -> L54
        L64:
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L54
        L68:
            return r0
        L69:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "mac:err:"
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "WifiUtils"
            cn.jiguang.commons.w.a.f(r2, r1)
        L83:
            return r0
    }

    public static java.lang.String k() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r2 = 0
            if (r0 < r1) goto L8
            return r2
        L8:
            android.net.wifi.WifiInfo r0 = t()
            if (r0 == 0) goto L1f
            cn.jiguang.commons.g.l r1 = cn.jiguang.commons.g.l.a()
            r3 = 1606(0x646, float:2.25E-42)
            boolean r1 = r1.a(r3)
            if (r1 == 0) goto L1f
            java.lang.String r0 = r0.getMacAddress()
            return r0
        L1f:
            return r2
    }

    public static java.util.List l() {
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Exception -> L9
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "net:err:interfaces:"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "WifiUtils"
            cn.jiguang.commons.w.a.f(r1, r0)
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    public static java.lang.String m() {
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Exception -> L2f
        L4:
            boolean r1 = r0.hasMoreElements()     // Catch: java.lang.Exception -> L2f
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.Exception -> L2f
            java.net.NetworkInterface r1 = (java.net.NetworkInterface) r1     // Catch: java.lang.Exception -> L2f
            java.util.Enumeration r1 = r1.getInetAddresses()     // Catch: java.lang.Exception -> L2f
        L14:
            boolean r2 = r1.hasMoreElements()     // Catch: java.lang.Exception -> L2f
            if (r2 == 0) goto L4
            java.lang.Object r2 = r1.nextElement()     // Catch: java.lang.Exception -> L2f
            java.net.InetAddress r2 = (java.net.InetAddress) r2     // Catch: java.lang.Exception -> L2f
            boolean r3 = r2.isLoopbackAddress()     // Catch: java.lang.Exception -> L2f
            if (r3 != 0) goto L14
            boolean r3 = r2 instanceof java.net.Inet4Address     // Catch: java.lang.Exception -> L2f
            if (r3 == 0) goto L14
            java.lang.String r0 = r2.getHostAddress()     // Catch: java.lang.Exception -> L2f
            return r0
        L2f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ip:err:"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "WifiUtils"
            cn.jiguang.commons.w.a.f(r1, r0)
        L4a:
            java.lang.String r0 = ""
            return r0
    }

    public static java.util.List n() {
            java.lang.String r0 = "WifiUtils"
            r1 = 0
            android.net.wifi.WifiManager r2 = u()     // Catch: java.lang.Exception -> L1c
            if (r2 != 0) goto L1f
            java.lang.String r2 = "scan:err:no_manager"
            cn.jiguang.commons.w.a.f(r0, r2)     // Catch: java.lang.Exception -> L1c
            cn.jiguang.commons.A.a r2 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Exception -> L1c
            r3 = 3022(0xbce, float:4.235E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L1c
            r2.n(r3)     // Catch: java.lang.Exception -> L1c
            return r1
        L1c:
            r2 = move-exception
            goto L99
        L1f:
            boolean r3 = y()     // Catch: java.lang.Exception -> L1c
            if (r3 != 0) goto L38
            java.lang.String r2 = "scan:err:wifi_disabled"
            cn.jiguang.commons.w.a.f(r0, r2)     // Catch: java.lang.Exception -> L1c
            cn.jiguang.commons.A.a r2 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Exception -> L1c
            r3 = 3023(0xbcf, float:4.236E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L1c
            r2.n(r3)     // Catch: java.lang.Exception -> L1c
            return r1
        L38:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1c
            r4 = 23
            if (r3 < r4) goto L73
            boolean r4 = z()     // Catch: java.lang.Exception -> L1c
            if (r4 != 0) goto L52
            cn.jiguang.commons.A.a r2 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Exception -> L1c
            r3 = 3018(0xbca, float:4.229E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L1c
            r2.n(r3)     // Catch: java.lang.Exception -> L1c
            return r1
        L52:
            r4 = 29
            if (r3 < r4) goto L73
            cn.jiguang.commons.L.q r3 = cn.jiguang.commons.L.q.g()     // Catch: java.lang.Exception -> L1c
            boolean r3 = r3.i()     // Catch: java.lang.Exception -> L1c
            if (r3 != 0) goto L73
            java.lang.String r2 = "scan:err:loc_disabled"
            cn.jiguang.commons.w.a.f(r0, r2)     // Catch: java.lang.Exception -> L1c
            cn.jiguang.commons.A.a r2 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Exception -> L1c
            r3 = 3024(0xbd0, float:4.238E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L1c
            r2.n(r3)     // Catch: java.lang.Exception -> L1c
            return r1
        L73:
            java.util.List r2 = r2.getScanResults()     // Catch: java.lang.Exception -> L1c
            if (r2 != 0) goto L7f
            java.lang.String r2 = "scan:err:null_results"
            cn.jiguang.commons.w.a.f(r0, r2)     // Catch: java.lang.Exception -> L1c
            return r1
        L7f:
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Exception -> L1c
            if (r3 == 0) goto L8b
            java.lang.String r3 = "scan:empty"
            cn.jiguang.commons.w.a.a(r0, r3)     // Catch: java.lang.Exception -> L1c
            return r2
        L8b:
            java.util.List r2 = a(r2)     // Catch: java.lang.Exception -> L1c
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Exception -> L1c
            if (r3 != 0) goto L98
            c(r2)     // Catch: java.lang.Exception -> L1c
        L98:
            return r2
        L99:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "scan:err:"
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.commons.w.a.f(r0, r2)
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()
            r2 = 3002(0xbba, float:4.207E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.n(r2)
            return r1
    }

    public static java.lang.String o() {
            android.net.DhcpInfo r0 = c()
            if (r0 == 0) goto Ld
            int r0 = r0.serverAddress
            java.lang.String r0 = a(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public static java.lang.String p() {
            android.net.DhcpInfo r0 = c()
            if (r0 == 0) goto Ld
            int r0 = r0.netmask
            java.lang.String r0 = a(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public static java.lang.String q() {
            android.net.wifi.WifiInfo r0 = t()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.String r0 = r0.getBSSID()     // Catch: java.lang.Exception -> Ld
            return r0
        Ld:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "wifi:err:bssid:"
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "WifiUtils"
            cn.jiguang.commons.w.a.f(r2, r0)
            return r1
    }

    public static java.util.List r() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            java.lang.String r2 = "WifiUtils"
            if (r0 < r1) goto L11
            java.lang.String r0 = "wifi:cfg:deprecated:api29+"
            cn.jiguang.commons.w.a.f(r2, r0)
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
        L11:
            boolean r0 = cn.jiguang.commons.L.u.d()
            r1 = 0
            if (r0 != 0) goto L1e
            java.lang.String r0 = "perm:denied:wifi_state"
        L1a:
            cn.jiguang.commons.w.a.f(r2, r0)
            return r1
        L1e:
            boolean r0 = cn.jiguang.commons.L.u.c()
            if (r0 != 0) goto L27
            java.lang.String r0 = "perm:denied:fine_location"
            goto L1a
        L27:
            android.net.wifi.WifiManager r0 = u()
            if (r0 != 0) goto L31
            java.lang.String r0 = "wifi:null:manager"
            goto L1a
        L31:
            java.util.List r0 = r0.getConfiguredNetworks()     // Catch: java.lang.Exception -> L36
            return r0
        L36:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "wifi:err:cfg:"
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L1a
    }

    public static android.net.wifi.WifiInfo s() {
            android.net.wifi.WifiManager r0 = u()
            r1 = 0
            java.lang.String r2 = "WifiUtils"
            if (r0 != 0) goto L10
            java.lang.String r0 = "wifi:null:manager"
            cn.jiguang.commons.w.a.f(r2, r0)
            return r1
        L10:
            boolean r3 = cn.jiguang.commons.L.g.g()
            if (r3 != 0) goto L1d
            java.lang.String r0 = "wifi:not_connected"
            cn.jiguang.commons.w.a.a(r2, r0)
            return r1
        L1d:
            android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()     // Catch: java.lang.Exception -> L22
            return r0
        L22:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "wifi:err:info:"
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            cn.jiguang.commons.w.a.f(r2, r0)
            return r1
    }

    public static android.net.wifi.WifiInfo t() {
            cn.jiguang.commons.g.n r0 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> Lf
            java.lang.Class<android.net.wifi.WifiInfo> r1 = android.net.wifi.WifiInfo.class
            r2 = 1615(0x64f, float:2.263E-42)
            java.lang.Object r0 = r0.a(r1, r2)     // Catch: java.lang.Exception -> Lf
            android.net.wifi.WifiInfo r0 = (android.net.wifi.WifiInfo) r0     // Catch: java.lang.Exception -> Lf
            return r0
        Lf:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "wifi:err:info:"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "WifiUtils"
            cn.jiguang.commons.w.a.f(r1, r0)
            r0 = 0
            return r0
    }

    private static android.net.wifi.WifiManager u() {
            java.lang.String r0 = "WifiUtils"
            r1 = 0
            boolean r2 = cn.jiguang.commons.L.u.d()     // Catch: java.lang.Exception -> L1c
            if (r2 != 0) goto L1e
            java.lang.String r2 = "perm:denied:wifi_state"
            cn.jiguang.commons.w.a.f(r0, r2)     // Catch: java.lang.Exception -> L1c
            cn.jiguang.commons.A.a r2 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Exception -> L1c
            r3 = 3017(0xbc9, float:4.228E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L1c
            r2.n(r3)     // Catch: java.lang.Exception -> L1c
            return r1
        L1c:
            r2 = move-exception
            goto L3c
        L1e:
            android.net.wifi.WifiManager r2 = cn.jiguang.commons.L.ah.a     // Catch: java.lang.Exception -> L1c
            if (r2 != 0) goto L39
            android.content.Context r2 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Exception -> L1c
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Exception -> L1c
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Exception -> L1c
            java.lang.String r3 = "wifi"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch: java.lang.Exception -> L1c
            android.net.wifi.WifiManager r2 = (android.net.wifi.WifiManager) r2     // Catch: java.lang.Exception -> L1c
            cn.jiguang.commons.L.ah.a = r2     // Catch: java.lang.Exception -> L1c
        L39:
            android.net.wifi.WifiManager r0 = cn.jiguang.commons.L.ah.a     // Catch: java.lang.Exception -> L1c
            return r0
        L3c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "wifi:err:manager:"
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.commons.w.a.f(r0, r2)
            return r1
    }

    public static int v() {
            android.net.wifi.WifiInfo r0 = t()
            r1 = -1
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r0.getNetworkId()     // Catch: java.lang.Exception -> Ld
            return r0
        Ld:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "wifi:err:netid:"
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "WifiUtils"
            cn.jiguang.commons.w.a.f(r2, r0)
            return r1
    }

    public static java.lang.String w() {
            android.net.wifi.WifiInfo r0 = t()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.String r0 = r0.getSSID()     // Catch: java.lang.Exception -> L11
            java.lang.String r0 = cn.jiguang.commons.L.ad.c(r0)     // Catch: java.lang.Exception -> L11
            return r0
        L11:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "wifi:err:ssid:"
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "WifiUtils"
            cn.jiguang.commons.w.a.f(r2, r0)
            return r1
    }

    public static int x() {
            android.net.wifi.WifiInfo r0 = t()
            r1 = -1
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r0.getRssi()     // Catch: java.lang.Exception -> L12
            r2 = 5
            int r0 = android.net.wifi.WifiManager.calculateSignalLevel(r0, r2)     // Catch: java.lang.Exception -> L12
            return r0
        L12:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "wifi:err:signal:"
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "WifiUtils"
            cn.jiguang.commons.w.a.f(r2, r0)
            return r1
    }

    public static boolean y() {
            android.net.wifi.WifiManager r0 = u()
            r1 = 0
            java.lang.String r2 = "WifiUtils"
            if (r0 != 0) goto L10
            java.lang.String r0 = "wifi:null:manager"
        Lc:
            cn.jiguang.commons.w.a.f(r2, r0)
            return r1
        L10:
            boolean r0 = r0.isWifiEnabled()     // Catch: java.lang.Exception -> L15
            return r0
        L15:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "wifi:err:state:"
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto Lc
    }

    private static boolean z() {
            boolean r0 = cn.jiguang.commons.L.u.c()
            boolean r1 = cn.jiguang.commons.L.u.a()
            java.lang.String r2 = "WifiUtils"
            if (r0 != 0) goto L16
            if (r1 == 0) goto Lf
            goto L16
        Lf:
            java.lang.String r0 = "perm:denied:location"
            cn.jiguang.commons.w.a.f(r2, r0)
            r0 = 0
            return r0
        L16:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r1 < r3) goto L23
            if (r0 != 0) goto L23
            java.lang.String r0 = "perm:recommend:fine_location"
            cn.jiguang.commons.w.a.f(r2, r0)
        L23:
            r0 = 1
            return r0
    }
}
