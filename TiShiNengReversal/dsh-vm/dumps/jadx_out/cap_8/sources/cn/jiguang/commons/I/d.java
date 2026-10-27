package cn.jiguang.commons.I;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class d {
    private static java.util.List a;

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

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            cn.jiguang.commons.I.d.a = r0
            return
    }

    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    private static int a(java.util.List r9, java.lang.String r10, java.lang.String r11) {
            java.lang.String r0 = " "
            java.lang.String r1 = "JLocationWifi"
            cn.jiguang.commons.I.d$a r2 = new cn.jiguang.commons.I.d$a
            r2.<init>()
            java.util.Collections.sort(r9, r2)
            r2 = 0
            r3 = 0
        Le:
            int r4 = r9.size()
            if (r2 >= r4) goto Le3
            java.lang.Object r4 = r9.get(r2)
            android.net.wifi.ScanResult r4 = (android.net.wifi.ScanResult) r4
            if (r4 != 0) goto L1e
            goto Ldf
        L1e:
            java.lang.String r5 = r4.SSID     // Catch: java.lang.Exception -> L60
            java.lang.String r5 = cn.jiguang.commons.L.ad.c(r5)     // Catch: java.lang.Exception -> L60
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L60
            if (r6 != 0) goto Laa
            java.lang.String r6 = "<unknown ssid>"
            boolean r6 = r6.equals(r5)     // Catch: java.lang.Exception -> L60
            if (r6 != 0) goto Laa
            java.lang.String r6 = "unknownssid"
            boolean r6 = r6.equals(r5)     // Catch: java.lang.Exception -> L60
            if (r6 == 0) goto L3c
            goto Laa
        L3c:
            cn.jiguang.commons.c.k r6 = new cn.jiguang.commons.c.k     // Catch: java.lang.Exception -> L60
            r6.<init>()     // Catch: java.lang.Exception -> L60
            cn.jiguang.commons.g.p r7 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Exception -> L60
            long r7 = r7.k()     // Catch: java.lang.Exception -> L60
            r6.a = r7     // Catch: java.lang.Exception -> L60
            r6.f1054c = r5     // Catch: java.lang.Exception -> L60
            java.lang.String r7 = "connect"
            if (r2 != 0) goto L65
            boolean r8 = android.text.TextUtils.equals(r5, r10)     // Catch: java.lang.Exception -> L60
            if (r8 == 0) goto L62
            java.lang.String r8 = r4.BSSID     // Catch: java.lang.Exception -> L60
            boolean r8 = android.text.TextUtils.equals(r8, r11)     // Catch: java.lang.Exception -> L60
            if (r8 == 0) goto L62
            goto L73
        L60:
            r4 = move-exception
            goto Lbf
        L62:
            java.lang.String r7 = "strongest"
            goto L73
        L65:
            boolean r8 = android.text.TextUtils.equals(r5, r10)     // Catch: java.lang.Exception -> L60
            if (r8 == 0) goto L76
            java.lang.String r8 = r4.BSSID     // Catch: java.lang.Exception -> L60
            boolean r8 = android.text.TextUtils.equals(r8, r11)     // Catch: java.lang.Exception -> L60
            if (r8 == 0) goto L76
        L73:
            r6.f1055d = r7     // Catch: java.lang.Exception -> L60
            goto L79
        L76:
            r7 = 0
            r6.f1055d = r7     // Catch: java.lang.Exception -> L60
        L79:
            int r7 = r4.level     // Catch: java.lang.Exception -> L60
            r6.f1056e = r7     // Catch: java.lang.Exception -> L60
            java.lang.String r7 = r4.BSSID     // Catch: java.lang.Exception -> L60
            r6.f1057f = r7     // Catch: java.lang.Exception -> L60
            java.util.List r7 = cn.jiguang.commons.I.d.a     // Catch: java.lang.Exception -> L60
            r7.add(r6)     // Catch: java.lang.Exception -> L60
            int r3 = r3 + 1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L60
            r6.<init>()     // Catch: java.lang.Exception -> L60
            java.lang.String r7 = "added wifi: "
            r6.append(r7)     // Catch: java.lang.Exception -> L60
            r6.append(r5)     // Catch: java.lang.Exception -> L60
            r6.append(r0)     // Catch: java.lang.Exception -> L60
            java.lang.String r5 = r4.BSSID     // Catch: java.lang.Exception -> L60
            r6.append(r5)     // Catch: java.lang.Exception -> L60
            r6.append(r0)     // Catch: java.lang.Exception -> L60
            int r4 = r4.level     // Catch: java.lang.Exception -> L60
            r6.append(r4)     // Catch: java.lang.Exception -> L60
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Exception -> L60
            goto Lbb
        Laa:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L60
            r4.<init>()     // Catch: java.lang.Exception -> L60
            java.lang.String r6 = "skip invalid ssid: "
            r4.append(r6)     // Catch: java.lang.Exception -> L60
            r4.append(r5)     // Catch: java.lang.Exception -> L60
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L60
        Lbb:
            cn.jiguang.commons.w.a.a(r1, r4)     // Catch: java.lang.Exception -> L60
            goto Ldf
        Lbf:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "scan err "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = ": "
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            cn.jiguang.commons.w.a.f(r1, r4)
        Ldf:
            int r2 = r2 + 1
            goto Le
        Le3:
            return r3
    }

    private static java.lang.String a(boolean r6) {
            java.lang.String r0 = "JLocationWifi"
            r1 = 0
            cn.jiguang.commons.g.n r2 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> Lc8
            r3 = 1508(0x5e4, float:2.113E-42)
            java.util.List r2 = r2.c(r3, r6)     // Catch: java.lang.Exception -> Lc8
            if (r2 == 0) goto Lc2
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Exception -> L39
            if (r3 == 0) goto L17
            goto Lc2
        L17:
            cn.jiguang.commons.g.n r3 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> La8
            r4 = 1611(0x64b, float:2.257E-42)
            r5 = -1
            int r6 = r3.a(r4, r6, r5)     // Catch: java.lang.Exception -> La8
            if (r6 != r5) goto L3c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L39
            r2.<init>()     // Catch: java.lang.Exception -> L39
            java.lang.String r3 = "invalid net id: "
            r2.append(r3)     // Catch: java.lang.Exception -> L39
            r2.append(r6)     // Catch: java.lang.Exception -> L39
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Exception -> L39
            cn.jiguang.commons.w.a.f(r0, r6)     // Catch: java.lang.Exception -> L39
            return r1
        L39:
            r6 = move-exception
            goto Le3
        L3c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L39
            r3.<init>()     // Catch: java.lang.Exception -> L39
            java.lang.String r4 = "search net id "
            r3.append(r4)     // Catch: java.lang.Exception -> L39
            r3.append(r6)     // Catch: java.lang.Exception -> L39
            java.lang.String r4 = " in "
            r3.append(r4)     // Catch: java.lang.Exception -> L39
            int r4 = r2.size()     // Catch: java.lang.Exception -> L39
            r3.append(r4)     // Catch: java.lang.Exception -> L39
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L39
            cn.jiguang.commons.w.a.a(r0, r3)     // Catch: java.lang.Exception -> L39
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L39
        L60:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> L39
            if (r3 == 0) goto L93
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> L39
            android.net.wifi.WifiConfiguration r3 = (android.net.wifi.WifiConfiguration) r3     // Catch: java.lang.Exception -> L39
            if (r3 == 0) goto L60
            int r4 = r3.networkId     // Catch: java.lang.Exception -> L39
            if (r4 != r6) goto L60
            java.lang.String r3 = r3.SSID     // Catch: java.lang.Exception -> L39
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L39
            if (r4 != 0) goto L60
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L39
            r6.<init>()     // Catch: java.lang.Exception -> L39
            java.lang.String r2 = "found wifi config: "
            r6.append(r2)     // Catch: java.lang.Exception -> L39
            r6.append(r3)     // Catch: java.lang.Exception -> L39
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L39
            cn.jiguang.commons.w.a.a(r0, r6)     // Catch: java.lang.Exception -> L39
            java.lang.String r6 = cn.jiguang.commons.L.ad.c(r3)     // Catch: java.lang.Exception -> L39
            return r6
        L93:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L39
            r2.<init>()     // Catch: java.lang.Exception -> L39
            java.lang.String r3 = "no match net id: "
            r2.append(r3)     // Catch: java.lang.Exception -> L39
            r2.append(r6)     // Catch: java.lang.Exception -> L39
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Exception -> L39
            cn.jiguang.commons.w.a.f(r0, r6)     // Catch: java.lang.Exception -> L39
            return r1
        La8:
            r6 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L39
            r2.<init>()     // Catch: java.lang.Exception -> L39
            java.lang.String r3 = "net id err: "
            r2.append(r3)     // Catch: java.lang.Exception -> L39
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Exception -> L39
            r2.append(r6)     // Catch: java.lang.Exception -> L39
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Exception -> L39
            cn.jiguang.commons.w.a.f(r0, r6)     // Catch: java.lang.Exception -> L39
            return r1
        Lc2:
            java.lang.String r6 = "no wifi config"
            cn.jiguang.commons.w.a.f(r0, r6)     // Catch: java.lang.Exception -> L39
            return r1
        Lc8:
            r6 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L39
            r2.<init>()     // Catch: java.lang.Exception -> L39
            java.lang.String r3 = "wifi config err: "
            r2.append(r3)     // Catch: java.lang.Exception -> L39
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Exception -> L39
            r2.append(r6)     // Catch: java.lang.Exception -> L39
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Exception -> L39
            cn.jiguang.commons.w.a.f(r0, r6)     // Catch: java.lang.Exception -> L39
            return r1
        Le3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "wifi config ssid err: "
            r2.append(r3)
            java.lang.String r6 = r6.getMessage()
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            cn.jiguang.commons.w.a.c(r0, r6)
            return r1
    }

    private static void a(boolean r7, java.lang.String r8, java.lang.String r9) {
            java.lang.String r0 = " "
            java.lang.String r1 = "JLocationWifi"
            java.lang.String r2 = "get current wifi"
            cn.jiguang.commons.w.a.a(r1, r2)     // Catch: java.lang.Exception -> Lde
            java.lang.String r2 = "null"
            java.lang.String r3 = "ok"
            if (r8 != 0) goto L1c
            cn.jiguang.commons.g.n r4 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> L1a
            r5 = 1608(0x648, float:2.253E-42)
            java.lang.String r8 = r4.d(r5, r7)     // Catch: java.lang.Exception -> L1a
            goto L1c
        L1a:
            r4 = move-exception
            goto L36
        L1c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1a
            r4.<init>()     // Catch: java.lang.Exception -> L1a
            java.lang.String r5 = "ssid: "
            r4.append(r5)     // Catch: java.lang.Exception -> L1a
            if (r8 == 0) goto L2a
            r5 = r3
            goto L2b
        L2a:
            r5 = r2
        L2b:
            r4.append(r5)     // Catch: java.lang.Exception -> L1a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L1a
            cn.jiguang.commons.w.a.a(r1, r4)     // Catch: java.lang.Exception -> L1a
            goto L4e
        L36:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lde
            r5.<init>()     // Catch: java.lang.Exception -> Lde
            java.lang.String r6 = "ssid err: "
            r5.append(r6)     // Catch: java.lang.Exception -> Lde
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Exception -> Lde
            r5.append(r4)     // Catch: java.lang.Exception -> Lde
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Exception -> Lde
            cn.jiguang.commons.w.a.f(r1, r4)     // Catch: java.lang.Exception -> Lde
        L4e:
            if (r9 != 0) goto L5d
            cn.jiguang.commons.g.n r4 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> L5b
            r5 = 1601(0x641, float:2.243E-42)
            java.lang.String r9 = r4.d(r5, r7)     // Catch: java.lang.Exception -> L5b
            goto L5d
        L5b:
            r2 = move-exception
            goto L75
        L5d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5b
            r4.<init>()     // Catch: java.lang.Exception -> L5b
            java.lang.String r5 = "bssid: "
            r4.append(r5)     // Catch: java.lang.Exception -> L5b
            if (r9 == 0) goto L6a
            r2 = r3
        L6a:
            r4.append(r2)     // Catch: java.lang.Exception -> L5b
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> L5b
            cn.jiguang.commons.w.a.a(r1, r2)     // Catch: java.lang.Exception -> L5b
            goto L8d
        L75:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lde
            r3.<init>()     // Catch: java.lang.Exception -> Lde
            java.lang.String r4 = "bssid err: "
            r3.append(r4)     // Catch: java.lang.Exception -> Lde
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Exception -> Lde
            r3.append(r2)     // Catch: java.lang.Exception -> Lde
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> Lde
            cn.jiguang.commons.w.a.f(r1, r2)     // Catch: java.lang.Exception -> Lde
        L8d:
            r2 = -1
            cn.jiguang.commons.g.n r3 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> Lae
            r4 = 1610(0x64a, float:2.256E-42)
            int r3 = r3.a(r4, r7, r2)     // Catch: java.lang.Exception -> Lae
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lae
            r4.<init>()     // Catch: java.lang.Exception -> Lae
            java.lang.String r5 = "signal: "
            r4.append(r5)     // Catch: java.lang.Exception -> Lae
            r4.append(r3)     // Catch: java.lang.Exception -> Lae
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lae
            cn.jiguang.commons.w.a.a(r1, r4)     // Catch: java.lang.Exception -> Lae
            r2 = r3
            goto Lc7
        Lae:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lde
            r4.<init>()     // Catch: java.lang.Exception -> Lde
            java.lang.String r5 = "signal err: "
            r4.append(r5)     // Catch: java.lang.Exception -> Lde
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Exception -> Lde
            r4.append(r3)     // Catch: java.lang.Exception -> Lde
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Exception -> Lde
            cn.jiguang.commons.w.a.f(r1, r3)     // Catch: java.lang.Exception -> Lde
        Lc7:
            boolean r3 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Exception -> Lde
            java.lang.String r4 = "unknownssid"
            java.lang.String r5 = "<unknown ssid>"
            if (r3 != 0) goto Le0
            boolean r3 = r5.equals(r8)     // Catch: java.lang.Exception -> Lde
            if (r3 != 0) goto Le0
            boolean r3 = r4.equals(r8)     // Catch: java.lang.Exception -> Lde
            if (r3 == 0) goto Le9
            goto Le0
        Lde:
            r7 = move-exception
            goto L14b
        Le0:
            java.lang.String r8 = "ssid empty, try config"
            cn.jiguang.commons.w.a.a(r1, r8)     // Catch: java.lang.Exception -> Lde
            java.lang.String r8 = a(r7)     // Catch: java.lang.Exception -> Lde
        Le9:
            boolean r7 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Exception -> Lde
            if (r7 != 0) goto L148
            boolean r7 = r5.equals(r8)     // Catch: java.lang.Exception -> Lde
            if (r7 != 0) goto L148
            boolean r7 = r4.equals(r8)     // Catch: java.lang.Exception -> Lde
            if (r7 == 0) goto Lfc
            goto L148
        Lfc:
            boolean r7 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> Lde
            if (r7 == 0) goto L108
            java.lang.String r7 = "bssid empty"
        L104:
            cn.jiguang.commons.w.a.f(r1, r7)     // Catch: java.lang.Exception -> Lde
            goto L163
        L108:
            cn.jiguang.commons.c.k r7 = new cn.jiguang.commons.c.k     // Catch: java.lang.Exception -> Lde
            r7.<init>()     // Catch: java.lang.Exception -> Lde
            cn.jiguang.commons.g.p r3 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Exception -> Lde
            long r3 = r3.k()     // Catch: java.lang.Exception -> Lde
            r7.a = r3     // Catch: java.lang.Exception -> Lde
            r7.f1054c = r8     // Catch: java.lang.Exception -> Lde
            r7.f1057f = r9     // Catch: java.lang.Exception -> Lde
            r7.f1056e = r2     // Catch: java.lang.Exception -> Lde
            java.lang.String r3 = "strongest"
            r7.f1055d = r3     // Catch: java.lang.Exception -> Lde
            java.util.List r3 = cn.jiguang.commons.I.d.a     // Catch: java.lang.Exception -> Lde
            r3.add(r7)     // Catch: java.lang.Exception -> Lde
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lde
            r7.<init>()     // Catch: java.lang.Exception -> Lde
            java.lang.String r3 = "wifi added: "
            r7.append(r3)     // Catch: java.lang.Exception -> Lde
            r7.append(r8)     // Catch: java.lang.Exception -> Lde
            r7.append(r0)     // Catch: java.lang.Exception -> Lde
            r7.append(r9)     // Catch: java.lang.Exception -> Lde
            r7.append(r0)     // Catch: java.lang.Exception -> Lde
            r7.append(r2)     // Catch: java.lang.Exception -> Lde
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> Lde
            cn.jiguang.commons.w.a.d(r1, r7)     // Catch: java.lang.Exception -> Lde
            goto L163
        L148:
            java.lang.String r7 = "ssid still empty"
            goto L104
        L14b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "current wifi err: "
            r8.append(r9)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            cn.jiguang.commons.w.a.c(r1, r7)
        L163:
            return
    }

    public static java.util.List c(boolean r9) {
            java.lang.String r0 = "null"
            java.lang.String r1 = "ok"
            java.lang.String r2 = "JLocationWifi"
            java.util.List r3 = cn.jiguang.commons.I.d.a
            r3.clear()
            r3 = 0
            cn.jiguang.commons.g.n r4 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> Lcb
            r5 = 1505(0x5e1, float:2.109E-42)
            java.util.List r4 = r4.c(r5, r9)     // Catch: java.lang.Exception -> Lcb
            cn.jiguang.commons.g.n r5 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> L3c
            r6 = 1608(0x648, float:2.253E-42)
            java.lang.String r5 = r5.d(r6, r9)     // Catch: java.lang.Exception -> L3c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3a
            r6.<init>()     // Catch: java.lang.Exception -> L3a
            java.lang.String r7 = "ssid: "
            r6.append(r7)     // Catch: java.lang.Exception -> L3a
            if (r5 == 0) goto L2e
            r7 = r1
            goto L2f
        L2e:
            r7 = r0
        L2f:
            r6.append(r7)     // Catch: java.lang.Exception -> L3a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L3a
            cn.jiguang.commons.w.a.a(r2, r6)     // Catch: java.lang.Exception -> L3a
            goto L56
        L3a:
            r6 = move-exception
            goto L3e
        L3c:
            r6 = move-exception
            r5 = r3
        L3e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lcb
            r7.<init>()     // Catch: java.lang.Exception -> Lcb
            java.lang.String r8 = "ssid err: "
            r7.append(r8)     // Catch: java.lang.Exception -> Lcb
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Exception -> Lcb
            r7.append(r6)     // Catch: java.lang.Exception -> Lcb
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Exception -> Lcb
            cn.jiguang.commons.w.a.f(r2, r6)     // Catch: java.lang.Exception -> Lcb
        L56:
            cn.jiguang.commons.g.n r6 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> L7a
            r7 = 1601(0x641, float:2.243E-42)
            java.lang.String r6 = r6.d(r7, r9)     // Catch: java.lang.Exception -> L7a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L78
            r7.<init>()     // Catch: java.lang.Exception -> L78
            java.lang.String r8 = "bssid: "
            r7.append(r8)     // Catch: java.lang.Exception -> L78
            if (r6 == 0) goto L6d
            r0 = r1
        L6d:
            r7.append(r0)     // Catch: java.lang.Exception -> L78
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Exception -> L78
            cn.jiguang.commons.w.a.a(r2, r0)     // Catch: java.lang.Exception -> L78
            goto L94
        L78:
            r0 = move-exception
            goto L7c
        L7a:
            r0 = move-exception
            r6 = r3
        L7c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lcb
            r1.<init>()     // Catch: java.lang.Exception -> Lcb
            java.lang.String r7 = "bssid err: "
            r1.append(r7)     // Catch: java.lang.Exception -> Lcb
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Exception -> Lcb
            r1.append(r0)     // Catch: java.lang.Exception -> Lcb
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> Lcb
            cn.jiguang.commons.w.a.f(r2, r0)     // Catch: java.lang.Exception -> Lcb
        L94:
            if (r4 == 0) goto Lcd
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Exception -> Lcb
            if (r0 != 0) goto Lcd
            int r0 = a(r4, r5, r6)     // Catch: java.lang.Exception -> Lcb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lcb
            r1.<init>()     // Catch: java.lang.Exception -> Lcb
            java.lang.String r7 = "wifi scan: "
            r1.append(r7)     // Catch: java.lang.Exception -> Lcb
            int r4 = r4.size()     // Catch: java.lang.Exception -> Lcb
            r1.append(r4)     // Catch: java.lang.Exception -> Lcb
            java.lang.String r4 = ", processed: "
            r1.append(r4)     // Catch: java.lang.Exception -> Lcb
            r1.append(r0)     // Catch: java.lang.Exception -> Lcb
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Lcb
            cn.jiguang.commons.w.a.a(r2, r1)     // Catch: java.lang.Exception -> Lcb
            if (r0 <= 0) goto Lc4
            goto Lfe
        Lc4:
            java.lang.String r0 = "wifi scan all filtered, try current wifi"
        Lc7:
            cn.jiguang.commons.w.a.a(r2, r0)     // Catch: java.lang.Exception -> Lcb
            goto Ld1
        Lcb:
            r0 = move-exception
            goto Ld5
        Lcd:
            java.lang.String r0 = "wifi scan empty"
            goto Lc7
        Ld1:
            a(r9, r5, r6)     // Catch: java.lang.Exception -> Lcb
            goto Lfe
        Ld5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "wifi list err: "
            r1.append(r4)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            cn.jiguang.commons.w.a.c(r2, r0)
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()
            r1 = 3002(0xbba, float:4.207E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.n(r1)
            a(r9, r3, r3)
        Lfe:
            java.util.List r9 = cn.jiguang.commons.I.d.a
            if (r9 == 0) goto L116
            int r9 = r9.size()
            if (r9 <= 0) goto L116
            cn.jiguang.commons.A.a r9 = cn.jiguang.commons.A.a.f()
            r0 = 3000(0xbb8, float:4.204E-42)
        L10e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.n(r0)
            goto L11d
        L116:
            cn.jiguang.commons.A.a r9 = cn.jiguang.commons.A.a.f()
            r0 = 3001(0xbb9, float:4.205E-42)
            goto L10e
        L11d:
            java.util.List r9 = cn.jiguang.commons.I.d.a
            return r9
    }
}
