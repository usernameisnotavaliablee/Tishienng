package cn.easyar.engine;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
class Magnetometer {
    private android.hardware.SensorManager manager_;
    private android.hardware.Sensor sensor_;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface IClosable {
        void close();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface IOnUpdated {
        void invoke(float r1, float r2, float r3, long r4);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class NativeOnUpdated implements cn.easyar.engine.Magnetometer.IOnUpdated {
        public long ptr;

        public NativeOnUpdated() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // cn.easyar.engine.Magnetometer.IOnUpdated
        public native void invoke(float r1, float r2, float r3, long r4);
    }

    public Magnetometer(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "sensor"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.hardware.SensorManager r2 = (android.hardware.SensorManager) r2
            r1.manager_ = r2
            r0 = 2
            android.hardware.Sensor r2 = r2.getDefaultSensor(r0)
            r1.sensor_ = r2
            return
    }

    static /* synthetic */ android.hardware.SensorManager access$000(cn.easyar.engine.Magnetometer r0) {
            android.hardware.SensorManager r0 = r0.manager_
            return r0
    }

    public boolean isAvailable() {
            r1 = this;
            android.hardware.Sensor r0 = r1.sensor_
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public cn.easyar.engine.Magnetometer.IClosable open(int r4, cn.easyar.engine.Magnetometer.IOnUpdated r5) {
            r3 = this;
            android.hardware.Sensor r0 = r3.sensor_
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            cn.easyar.engine.Magnetometer$1 r0 = new cn.easyar.engine.Magnetometer$1
            r0.<init>(r3, r5)
            android.hardware.SensorManager r5 = r3.manager_
            android.hardware.Sensor r2 = r3.sensor_
            boolean r4 = r5.registerListener(r0, r2, r4)
            if (r4 != 0) goto L16
            return r1
        L16:
            cn.easyar.engine.Magnetometer$2 r4 = new cn.easyar.engine.Magnetometer$2
            r4.<init>(r3, r0)
            return r4
    }
}
