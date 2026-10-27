package cn.jiguang.commons.G;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    private final java.util.concurrent.ConcurrentHashMap a;

    /* renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.ConcurrentHashMap f791c;

    /* renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f792d;

    /* renamed from: e, reason: collision with root package name */
    private final cn.jiguang.commons.G.c f793e;

    public a(cn.jiguang.commons.G.c r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r2.a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r2.f791c = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.f792d = r0
            r2.f793e = r3
            return
    }

    private cn.jiguang.commons.bean.Peripheral a(android.bluetooth.BluetoothDevice r13) {
            r12 = this;
            r0 = 0
            if (r13 != 0) goto L4
            return r0
        L4:
            cn.jiguang.commons.bean.Peripheral r1 = new cn.jiguang.commons.bean.Peripheral     // Catch: java.lang.Exception -> L1b
            r1.<init>()     // Catch: java.lang.Exception -> L1b
            java.lang.String r2 = r13.getAddress()     // Catch: java.lang.Exception -> L1b
            r1.c(r2)     // Catch: java.lang.Exception -> L1b
            java.lang.String r2 = r13.getName()     // Catch: java.lang.Exception -> L1b
            if (r2 == 0) goto L1e
            java.lang.String r2 = r13.getName()     // Catch: java.lang.Exception -> L1b
            goto L20
        L1b:
            r13 = move-exception
            goto L146
        L1e:
            java.lang.String r2 = ""
        L20:
            r1.d(r2)     // Catch: java.lang.Exception -> L1b
            int r2 = r13.getBondState()     // Catch: java.lang.Exception -> L1b
            r1.a(r2)     // Catch: java.lang.Exception -> L1b
            android.bluetooth.BluetoothClass r2 = r13.getBluetoothClass()     // Catch: java.lang.Exception -> L1b
            if (r2 == 0) goto L3a
            int r3 = r2.getDeviceClass()     // Catch: java.lang.Exception -> L1b
            r1.c(r3)     // Catch: java.lang.Exception -> L1b
            cn.jiguang.commons.G.f.a(r1, r13, r2)     // Catch: java.lang.Exception -> L1b
        L3a:
            android.os.ParcelUuid[] r3 = r13.getUuids()     // Catch: java.lang.Exception -> L1b
            r4 = 0
            if (r3 == 0) goto L53
            int r5 = r3.length     // Catch: java.lang.Exception -> L1b
            r6 = 0
        L43:
            if (r6 >= r5) goto L53
            r7 = r3[r6]     // Catch: java.lang.Exception -> L1b
            if (r7 == 0) goto L50
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L1b
            r1.a(r7)     // Catch: java.lang.Exception -> L1b
        L50:
            int r6 = r6 + 1
            goto L43
        L53:
            cn.jiguang.commons.bean.EddystoneData r3 = new cn.jiguang.commons.bean.EddystoneData     // Catch: java.lang.Exception -> L1b
            r3.<init>()     // Catch: java.lang.Exception -> L1b
            cn.jiguang.commons.G.c r5 = r12.f793e     // Catch: java.lang.Exception -> L1b
            int r5 = r5.a(r13)     // Catch: java.lang.Exception -> L1b
            r6 = 8
            r7 = 2
            r8 = 1
            if (r5 != r7) goto L70
            r3.c(r8)     // Catch: java.lang.Exception -> L1b
            int r9 = r1.i()     // Catch: java.lang.Exception -> L1b
            if (r9 != 0) goto L70
            r1.e(r6)     // Catch: java.lang.Exception -> L1b
        L70:
            cn.jiguang.commons.G.c r9 = r12.f793e     // Catch: java.lang.Exception -> L1b
            int r9 = r9.c(r13)     // Catch: java.lang.Exception -> L1b
            if (r9 != r7) goto L84
            r3.c(r8)     // Catch: java.lang.Exception -> L1b
            int r10 = r1.i()     // Catch: java.lang.Exception -> L1b
            if (r10 != 0) goto L84
            r1.e(r8)     // Catch: java.lang.Exception -> L1b
        L84:
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1b
            r11 = 30
            if (r10 < r11) goto L94
            java.lang.String r13 = cn.jiguang.commons.G.b.a(r13)     // Catch: java.lang.Exception -> L1b
            if (r13 == 0) goto L91
            r4 = 1
        L91:
            r3.a(r4)     // Catch: java.lang.Exception -> L1b
        L94:
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Exception -> L1b
            r13.<init>()     // Catch: java.lang.Exception -> L1b
            if (r2 == 0) goto L129
            r4 = 2097152(0x200000, float:2.938736E-39)
            boolean r4 = r2.hasService(r4)     // Catch: java.lang.Exception -> L1b
            if (r4 == 0) goto Laa
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L1b
            r13.add(r4)     // Catch: java.lang.Exception -> L1b
        Laa:
            r4 = 4194304(0x400000, float:5.877472E-39)
            boolean r4 = r2.hasService(r4)     // Catch: java.lang.Exception -> L1b
            if (r4 == 0) goto Lb9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L1b
            r13.add(r4)     // Catch: java.lang.Exception -> L1b
        Lb9:
            r4 = 131072(0x20000, float:1.83671E-40)
            boolean r4 = r2.hasService(r4)     // Catch: java.lang.Exception -> L1b
            if (r4 == 0) goto Lc9
            r4 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L1b
            r13.add(r4)     // Catch: java.lang.Exception -> L1b
        Lc9:
            r4 = 1048576(0x100000, float:1.469368E-39)
            boolean r4 = r2.hasService(r4)     // Catch: java.lang.Exception -> L1b
            if (r4 == 0) goto Ld9
            r4 = 4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L1b
            r13.add(r4)     // Catch: java.lang.Exception -> L1b
        Ld9:
            r4 = 524288(0x80000, float:7.34684E-40)
            boolean r4 = r2.hasService(r4)     // Catch: java.lang.Exception -> L1b
            if (r4 == 0) goto Le9
            r4 = 5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L1b
            r13.add(r4)     // Catch: java.lang.Exception -> L1b
        Le9:
            r4 = 65536(0x10000, float:9.1835E-41)
            boolean r4 = r2.hasService(r4)     // Catch: java.lang.Exception -> L1b
            if (r4 == 0) goto Lf9
            r4 = 6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L1b
            r13.add(r4)     // Catch: java.lang.Exception -> L1b
        Lf9:
            r4 = 8192(0x2000, float:1.148E-41)
            boolean r4 = r2.hasService(r4)     // Catch: java.lang.Exception -> L1b
            if (r4 == 0) goto L109
            r4 = 7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L1b
            r13.add(r4)     // Catch: java.lang.Exception -> L1b
        L109:
            r4 = 262144(0x40000, float:3.67342E-40)
            boolean r4 = r2.hasService(r4)     // Catch: java.lang.Exception -> L1b
            if (r4 == 0) goto L118
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L1b
            r13.add(r4)     // Catch: java.lang.Exception -> L1b
        L118:
            r4 = 8388608(0x800000, float:1.1754944E-38)
            boolean r2 = r2.hasService(r4)     // Catch: java.lang.Exception -> L1b
            if (r2 == 0) goto L129
            r2 = 9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L1b
            r13.add(r2)     // Catch: java.lang.Exception -> L1b
        L129:
            if (r5 != r7) goto L134
            r2 = 11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L1b
            r13.add(r2)     // Catch: java.lang.Exception -> L1b
        L134:
            if (r9 != r7) goto L13f
            r2 = 12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L1b
            r13.add(r2)     // Catch: java.lang.Exception -> L1b
        L13f:
            r3.a(r13)     // Catch: java.lang.Exception -> L1b
            r1.a(r3)     // Catch: java.lang.Exception -> L1b
            return r1
        L146:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "create peripheral failed: "
            r1.append(r2)
            java.lang.String r13 = r13.getMessage()
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            java.lang.String r1 = "BluetoothDeviceManager"
            cn.jiguang.commons.w.a.f(r1, r13)
            return r0
    }

    private cn.jiguang.commons.bean.Peripheral a(android.bluetooth.le.ScanResult r6) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto La2
            android.bluetooth.BluetoothDevice r1 = r6.getDevice()
            if (r1 != 0) goto Lb
            goto La2
        Lb:
            android.bluetooth.BluetoothDevice r1 = r6.getDevice()     // Catch: java.lang.Exception -> L31
            cn.jiguang.commons.bean.Peripheral r1 = r5.a(r1)     // Catch: java.lang.Exception -> L31
            if (r1 == 0) goto L87
            int r2 = r6.getRssi()     // Catch: java.lang.Exception -> L31
            r1.d(r2)     // Catch: java.lang.Exception -> L31
            android.bluetooth.le.ScanRecord r2 = r6.getScanRecord()     // Catch: java.lang.Exception -> L31
            if (r2 == 0) goto L87
            cn.jiguang.commons.bean.EddystoneData r2 = r1.e()     // Catch: java.lang.Exception -> L31
            if (r2 != 0) goto L33
            cn.jiguang.commons.bean.EddystoneData r2 = new cn.jiguang.commons.bean.EddystoneData     // Catch: java.lang.Exception -> L31
            r2.<init>()     // Catch: java.lang.Exception -> L31
            r1.a(r2)     // Catch: java.lang.Exception -> L31
            goto L33
        L31:
            r6 = move-exception
            goto L88
        L33:
            android.bluetooth.le.ScanRecord r3 = r6.getScanRecord()     // Catch: java.lang.Exception -> L31
            int r3 = r3.getAdvertiseFlags()     // Catch: java.lang.Exception -> L31
            r2.a(r3)     // Catch: java.lang.Exception -> L31
            android.bluetooth.le.ScanRecord r3 = r6.getScanRecord()     // Catch: java.lang.Exception -> L31
            java.lang.String r3 = r3.getDeviceName()     // Catch: java.lang.Exception -> L31
            if (r3 == 0) goto L51
            android.bluetooth.le.ScanRecord r3 = r6.getScanRecord()     // Catch: java.lang.Exception -> L31
            java.lang.String r3 = r3.getDeviceName()     // Catch: java.lang.Exception -> L31
            goto L53
        L51:
            java.lang.String r3 = ""
        L53:
            r2.a(r3)     // Catch: java.lang.Exception -> L31
            android.bluetooth.le.ScanRecord r3 = r6.getScanRecord()     // Catch: java.lang.Exception -> L31
            int r3 = r3.getTxPowerLevel()     // Catch: java.lang.Exception -> L31
            r2.g(r3)     // Catch: java.lang.Exception -> L31
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L31
            r4 = 26
            if (r3 < r4) goto L84
            int r3 = cn.jiguang.commons.G.q.a(r6)     // Catch: java.lang.Exception -> L31
            r2.d(r3)     // Catch: java.lang.Exception -> L31
            int r3 = cn.jiguang.commons.G.r.a(r6)     // Catch: java.lang.Exception -> L31
            r2.e(r3)     // Catch: java.lang.Exception -> L31
            int r3 = cn.jiguang.commons.G.s.a(r6)     // Catch: java.lang.Exception -> L31
            r4 = 127(0x7f, float:1.78E-43)
            if (r3 == r4) goto L84
            int r3 = cn.jiguang.commons.G.s.a(r6)     // Catch: java.lang.Exception -> L31
            r2.f(r3)     // Catch: java.lang.Exception -> L31
        L84:
            cn.jiguang.commons.G.g.a(r6, r1)     // Catch: java.lang.Exception -> L31
        L87:
            return r1
        L88:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "create peripheral from scan result failed: "
            r1.append(r2)
            java.lang.String r6 = r6.getMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.String r1 = "BluetoothDeviceManager"
            cn.jiguang.commons.w.a.f(r1, r6)
        La2:
            return r0
    }

    private cn.jiguang.commons.bean.Peripheral a(cn.jiguang.commons.G.i r11) {
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L79
            android.bluetooth.BluetoothDevice r1 = r11.a
            if (r1 != 0) goto L9
            goto L79
        L9:
            cn.jiguang.commons.bean.Peripheral r1 = r10.a(r1)     // Catch: java.lang.Exception -> L58
            if (r1 == 0) goto L5e
            int r2 = r11.f806c     // Catch: java.lang.Exception -> L58
            r1.d(r2)     // Catch: java.lang.Exception -> L58
            byte[] r2 = r11.f807d     // Catch: java.lang.Exception -> L58
            if (r2 == 0) goto L5e
            int r2 = r2.length     // Catch: java.lang.Exception -> L58
            r3 = 2
            if (r2 <= r3) goto L5e
            r2 = 0
            r4 = 0
        L1e:
            byte[] r5 = r11.f807d     // Catch: java.lang.Exception -> L58
            int r6 = r5.length     // Catch: java.lang.Exception -> L58
            int r6 = r6 - r3
            if (r4 >= r6) goto L5e
            r6 = r5[r4]     // Catch: java.lang.Exception -> L58
            if (r6 != 0) goto L29
            goto L5e
        L29:
            int r7 = r4 + 1
            r7 = r5[r7]     // Catch: java.lang.Exception -> L58
            r7 = r7 & 255(0xff, float:3.57E-43)
            r8 = 9
            if (r7 == r8) goto L37
            r8 = 8
            if (r7 != r8) goto L5a
        L37:
            r7 = 1
            if (r6 <= r7) goto L5a
            int r8 = r4 + r6
            int r8 = r8 + r7
            int r7 = r5.length     // Catch: java.lang.Exception -> L58
            if (r8 > r7) goto L5a
            int r7 = r6 + (-1)
            byte[] r8 = new byte[r7]     // Catch: java.lang.Exception -> L58
            int r9 = r4 + 2
            java.lang.System.arraycopy(r5, r9, r8, r2, r7)     // Catch: java.lang.Exception -> L58
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Exception -> L58
            r5.<init>(r8)     // Catch: java.lang.Exception -> L58
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L58
            if (r7 != 0) goto L5a
            r1.d(r5)     // Catch: java.lang.Exception -> L58
            return r1
        L58:
            r11 = move-exception
            goto L5f
        L5a:
            int r6 = r6 + 1
            int r4 = r4 + r6
            goto L1e
        L5e:
            return r1
        L5f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "create peripheral from legacy result failed: "
            r1.append(r2)
            java.lang.String r11 = r11.getMessage()
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            java.lang.String r1 = "BluetoothDeviceManager"
            cn.jiguang.commons.w.a.f(r1, r11)
        L79:
            return r0
    }

    public cn.jiguang.commons.bean.BleInfo a(android.bluetooth.BluetoothAdapter r4) {
            r3 = this;
            cn.jiguang.commons.bean.BleInfo r0 = new cn.jiguang.commons.bean.BleInfo
            r0.<init>()
            if (r4 == 0) goto L33
            java.lang.String r1 = r4.getName()
            java.lang.String r2 = ""
            if (r1 == 0) goto L14
            java.lang.String r1 = r4.getName()
            goto L15
        L14:
            r1 = r2
        L15:
            r0.c(r1)
            java.lang.String r1 = r4.getAddress()
            if (r1 == 0) goto L22
            java.lang.String r2 = r4.getAddress()
        L22:
            r0.a(r2)
            int r1 = r4.getScanMode()
            r0.a(r1)
            int r4 = r4.getState()
            r0.c(r4)
        L33:
            java.util.concurrent.ConcurrentHashMap r4 = r3.a
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L3d:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r4.next()
            cn.jiguang.commons.bean.Peripheral r1 = (cn.jiguang.commons.bean.Peripheral) r1
            r0.a(r1)
            goto L3d
        L4d:
            return r0
    }

    public java.lang.String a() {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "\nDevice Statistics:\n"
            r0.append(r1)
            java.util.concurrent.ConcurrentHashMap r1 = r9.a
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r1
            java.lang.String r1 = "Total unique devices: %d\n"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r0.append(r1)
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r3 = r9.a
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
        L32:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L61
            java.lang.Object r5 = r3.next()
            cn.jiguang.commons.bean.Peripheral r5 = (cn.jiguang.commons.bean.Peripheral) r5
            int r5 = r5.i()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r1.get(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            if (r6 != 0) goto L54
            r6 = 1
            goto L59
        L54:
            int r6 = r6.intValue()
            int r6 = r6 + r2
        L59:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1.put(r5, r6)
            goto L32
        L61:
            java.lang.String r3 = "\nDevice types:\n"
            r0.append(r3)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L6e:
            boolean r3 = r1.hasNext()
            r5 = 2
            if (r3 == 0) goto L93
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r6 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r6
            r5[r2] = r3
            java.lang.String r3 = "  Type %d: %d devices\n"
            java.lang.String r3 = java.lang.String.format(r3, r5)
            r0.append(r3)
            goto L6e
        L93:
            java.lang.String r1 = "\nDiscovery counts:\n"
            r0.append(r1)
            java.util.concurrent.ConcurrentHashMap r1 = r9.f791c
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        La2:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lc6
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r6 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r7[r4] = r6
            r7[r2] = r3
            java.lang.String r3 = "  %s: found %d times\n"
            java.lang.String r3 = java.lang.String.format(r3, r7)
            r0.append(r3)
            goto La2
        Lc6:
            java.util.concurrent.ConcurrentHashMap r1 = r9.f791c
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Lf5
            java.util.concurrent.ConcurrentHashMap r1 = r9.f791c
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
        Ld9:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto Leb
            java.lang.Object r5 = r1.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r3 = r3 + r5
            goto Ld9
        Leb:
            double r5 = (double) r3
            java.util.concurrent.ConcurrentHashMap r1 = r9.f791c
            int r1 = r1.size()
            double r7 = (double) r1
            double r5 = r5 / r7
            goto Lf7
        Lf5:
            r5 = 0
        Lf7:
            java.lang.Double r1 = java.lang.Double.valueOf(r5)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r1
            java.lang.String r1 = "\nAverage discoveries per device: %.2f\n"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void a(java.lang.Object r9) {
            r8 = this;
            java.lang.String r0 = "BluetoothDeviceManager"
            if (r9 != 0) goto L6
            goto L8c
        L6:
            boolean r1 = r9 instanceof android.bluetooth.le.ScanResult     // Catch: java.lang.Exception -> L11
            if (r1 == 0) goto L14
            android.bluetooth.le.ScanResult r9 = (android.bluetooth.le.ScanResult) r9     // Catch: java.lang.Exception -> L11
            cn.jiguang.commons.bean.Peripheral r9 = r8.a(r9)     // Catch: java.lang.Exception -> L11
            goto L1e
        L11:
            r9 = move-exception
            goto Laa
        L14:
            boolean r1 = r9 instanceof cn.jiguang.commons.G.i     // Catch: java.lang.Exception -> L11
            if (r1 == 0) goto L8d
            cn.jiguang.commons.G.i r9 = (cn.jiguang.commons.G.i) r9     // Catch: java.lang.Exception -> L11
            cn.jiguang.commons.bean.Peripheral r9 = r8.a(r9)     // Catch: java.lang.Exception -> L11
        L1e:
            if (r9 == 0) goto L8c
            java.lang.String r1 = r9.a()     // Catch: java.lang.Exception -> L11
            if (r1 == 0) goto L8c
            java.lang.String r1 = r9.a()     // Catch: java.lang.Exception -> L11
            java.util.concurrent.ConcurrentHashMap r2 = r8.f791c     // Catch: java.lang.Exception -> L11
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Exception -> L11
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Exception -> L11
            r3 = 1
            if (r2 != 0) goto L37
            r2 = 1
            goto L3c
        L37:
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> L11
            int r2 = r2 + r3
        L3c:
            java.util.concurrent.ConcurrentHashMap r4 = r8.f791c     // Catch: java.lang.Exception -> L11
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L11
            r4.put(r1, r5)     // Catch: java.lang.Exception -> L11
            java.util.concurrent.ConcurrentHashMap r4 = r8.a     // Catch: java.lang.Exception -> L11
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Exception -> L11
            cn.jiguang.commons.bean.Peripheral r4 = (cn.jiguang.commons.bean.Peripheral) r4     // Catch: java.lang.Exception -> L11
            r5 = 2
            r6 = 0
            if (r4 == 0) goto L70
            cn.jiguang.commons.G.j.a(r4, r9)     // Catch: java.lang.Exception -> L11
            java.lang.String r9 = "merged device info: %s, type=%d, discoveries=%d"
            int r4 = r4.i()     // Catch: java.lang.Exception -> L11
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L11
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L11
            r7[r6] = r1     // Catch: java.lang.Exception -> L11
            r7[r3] = r4     // Catch: java.lang.Exception -> L11
            r7[r5] = r2     // Catch: java.lang.Exception -> L11
            java.lang.String r9 = java.lang.String.format(r9, r7)     // Catch: java.lang.Exception -> L11
            goto L89
        L70:
            java.util.concurrent.ConcurrentHashMap r2 = r8.a     // Catch: java.lang.Exception -> L11
            r2.put(r1, r9)     // Catch: java.lang.Exception -> L11
            java.lang.String r2 = "added new device: %s, type=%d"
            int r9 = r9.i()     // Catch: java.lang.Exception -> L11
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> L11
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L11
            r4[r6] = r1     // Catch: java.lang.Exception -> L11
            r4[r3] = r9     // Catch: java.lang.Exception -> L11
            java.lang.String r9 = java.lang.String.format(r2, r4)     // Catch: java.lang.Exception -> L11
        L89:
            cn.jiguang.commons.w.a.a(r0, r9)     // Catch: java.lang.Exception -> L11
        L8c:
            return
        L8d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L11
            r1.<init>()     // Catch: java.lang.Exception -> L11
            java.lang.String r2 = "unknown result type: "
            r1.append(r2)     // Catch: java.lang.Exception -> L11
            java.lang.Class r9 = r9.getClass()     // Catch: java.lang.Exception -> L11
            java.lang.String r9 = r9.getName()     // Catch: java.lang.Exception -> L11
            r1.append(r9)     // Catch: java.lang.Exception -> L11
            java.lang.String r9 = r1.toString()     // Catch: java.lang.Exception -> L11
            cn.jiguang.commons.w.a.f(r0, r9)     // Catch: java.lang.Exception -> L11
            return
        Laa:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "process result failed: "
            r1.append(r2)
            java.lang.String r9 = r9.getMessage()
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            cn.jiguang.commons.w.a.f(r0, r9)
            return
    }

    public void c() {
            r2 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r2.a
            r0.clear()
            java.util.concurrent.ConcurrentHashMap r0 = r2.f791c
            r0.clear()
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f792d
            r1 = 0
            r0.set(r1)
            return
    }

    public void c(android.bluetooth.BluetoothAdapter r6) {
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f792d
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto Lc
            goto L93
        Lc:
            if (r6 == 0) goto L93
            java.util.Set r6 = r6.getBondedDevices()
            if (r6 == 0) goto L93
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "processing "
            r0.append(r1)
            int r1 = r6.size()
            r0.append(r1)
            java.lang.String r1 = " bonded devices"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BluetoothDeviceManager"
            cn.jiguang.commons.w.a.a(r1, r0)
            java.util.Iterator r6 = r6.iterator()
        L37:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L93
            java.lang.Object r0 = r6.next()
            android.bluetooth.BluetoothDevice r0 = (android.bluetooth.BluetoothDevice) r0
            if (r0 == 0) goto L37
            cn.jiguang.commons.bean.Peripheral r2 = r5.a(r0)     // Catch: java.lang.Exception -> L79
            if (r2 == 0) goto L37
            java.util.concurrent.ConcurrentHashMap r3 = r5.a     // Catch: java.lang.Exception -> L79
            java.lang.String r4 = r0.getAddress()     // Catch: java.lang.Exception -> L79
            r3.put(r4, r2)     // Catch: java.lang.Exception -> L79
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L79
            r3.<init>()     // Catch: java.lang.Exception -> L79
            java.lang.String r4 = "added bonded device: "
            r3.append(r4)     // Catch: java.lang.Exception -> L79
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> L79
            r3.append(r0)     // Catch: java.lang.Exception -> L79
            java.lang.String r0 = ", type: "
            r3.append(r0)     // Catch: java.lang.Exception -> L79
            int r0 = r2.i()     // Catch: java.lang.Exception -> L79
            r3.append(r0)     // Catch: java.lang.Exception -> L79
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> L79
            cn.jiguang.commons.w.a.a(r1, r0)     // Catch: java.lang.Exception -> L79
            goto L37
        L79:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "process bonded device failed: "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.commons.w.a.f(r1, r0)
            goto L37
        L93:
            return
    }
}
