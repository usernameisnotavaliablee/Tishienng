package d1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.TargetApi(18)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class b extends android.bluetooth.BluetoothGattCallback {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void c(com.clj.fastble.data.BleDevice r1, com.clj.fastble.exception.BleException r2);

    public abstract void d(com.clj.fastble.data.BleDevice r1, android.bluetooth.BluetoothGatt r2, int r3);

    public abstract void e(boolean r1, com.clj.fastble.data.BleDevice r2, android.bluetooth.BluetoothGatt r3, int r4);

    public abstract void f();
}
