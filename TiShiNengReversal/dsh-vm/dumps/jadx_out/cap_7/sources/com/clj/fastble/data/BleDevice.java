package com.clj.fastble.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class BleDevice implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.clj.fastble.data.BleDevice> CREATOR = null;
    private android.bluetooth.BluetoothDevice a;
    private byte[] b;
    private int c;
    private long d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements android.os.Parcelable.Creator<com.clj.fastble.data.BleDevice> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.clj.fastble.data.BleDevice a(android.os.Parcel r2) {
                r1 = this;
                com.clj.fastble.data.BleDevice r0 = new com.clj.fastble.data.BleDevice
                r0.<init>(r2)
                return r0
        }

        public com.clj.fastble.data.BleDevice[] b(int r1) {
                r0 = this;
                com.clj.fastble.data.BleDevice[] r1 = new com.clj.fastble.data.BleDevice[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.clj.fastble.data.BleDevice createFromParcel(android.os.Parcel r1) {
                r0 = this;
                com.clj.fastble.data.BleDevice r1 = r0.a(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.clj.fastble.data.BleDevice[] newArray(int r1) {
                r0 = this;
                com.clj.fastble.data.BleDevice[] r1 = r0.b(r1)
                return r1
        }
    }

    static {
            com.clj.fastble.data.BleDevice$a r0 = new com.clj.fastble.data.BleDevice$a
            r0.<init>()
            com.clj.fastble.data.BleDevice.CREATOR = r0
            return
    }

    public BleDevice(android.bluetooth.BluetoothDevice r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public BleDevice(android.bluetooth.BluetoothDevice r1, int r2, byte[] r3, long r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r2
            r0.d = r4
            return
    }

    protected BleDevice(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            java.lang.Class<android.bluetooth.BluetoothDevice> r0 = android.bluetooth.BluetoothDevice.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r3.readParcelable(r0)
            android.bluetooth.BluetoothDevice r0 = (android.bluetooth.BluetoothDevice) r0
            r2.a = r0
            byte[] r0 = r3.createByteArray()
            r2.b = r0
            int r0 = r3.readInt()
            r2.c = r0
            long r0 = r3.readLong()
            r2.d = r0
            return
    }

    public android.bluetooth.BluetoothDevice a() {
            r1 = this;
            android.bluetooth.BluetoothDevice r0 = r1.a
            return r0
    }

    public java.lang.String b() {
            r2 = this;
            android.bluetooth.BluetoothDevice r0 = r2.a
            if (r0 == 0) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.bluetooth.BluetoothDevice r1 = r2.a
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            android.bluetooth.BluetoothDevice r1 = r2.a
            java.lang.String r1 = r1.getAddress()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L20:
            java.lang.String r0 = ""
            return r0
    }

    public java.lang.String c() {
            r1 = this;
            android.bluetooth.BluetoothDevice r0 = r1.a
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getAddress()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public java.lang.String d() {
            r1 = this;
            android.bluetooth.BluetoothDevice r0 = r1.a
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getName()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int e() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    public byte[] f() {
            r1 = this;
            byte[] r0 = r1.b
            return r0
    }

    public long h() {
            r2 = this;
            long r0 = r2.d
            return r0
    }

    public void i(android.bluetooth.BluetoothDevice r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void k(int r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void l(byte[] r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void m(long r1) {
            r0 = this;
            r0.d = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            android.bluetooth.BluetoothDevice r0 = r2.a
            r3.writeParcelable(r0, r4)
            byte[] r4 = r2.b
            r3.writeByteArray(r4)
            int r4 = r2.c
            r3.writeInt(r4)
            long r0 = r2.d
            r3.writeLong(r0)
            return
    }
}
