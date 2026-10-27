package com.clj.fastble.bluetooth;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final /* synthetic */ class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static /* bridge */ /* synthetic */ android.bluetooth.BluetoothGatt a(android.bluetooth.BluetoothDevice r0, android.content.Context r1, boolean r2, android.bluetooth.BluetoothGattCallback r3, int r4) {
            android.bluetooth.BluetoothGatt r0 = r0.connectGatt(r1, r2, r3, r4)
            return r0
    }
}
