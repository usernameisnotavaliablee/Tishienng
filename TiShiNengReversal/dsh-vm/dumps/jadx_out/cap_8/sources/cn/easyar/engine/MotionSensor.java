package cn.easyar.engine;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
class MotionSensor {
    private android.hardware.Sensor attitudeSensor_;
    private android.hardware.Sensor gravitySensor_;
    private android.hardware.Sensor gyroscopeSensor_;
    private android.hardware.Sensor linearAccelerationSensor_;
    private android.hardware.SensorManager manager_;






    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface IClosable {
        void close();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface IOnUpdated {
        void updateAttitudeData(float r1, float r2, float r3, float r4, long r5);

        void updateGravityData(float r1, float r2, float r3, long r4);

        void updateGyroscopeData(float r1, float r2, float r3, long r4);

        void updateLinearAccelerationData(float r1, float r2, float r3, long r4);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class NativeOnUpdated implements cn.easyar.engine.MotionSensor.IOnUpdated {
        public long ptr;

        public NativeOnUpdated() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // cn.easyar.engine.MotionSensor.IOnUpdated
        public native void updateAttitudeData(float r1, float r2, float r3, float r4, long r5);

        @Override // cn.easyar.engine.MotionSensor.IOnUpdated
        public native void updateGravityData(float r1, float r2, float r3, long r4);

        @Override // cn.easyar.engine.MotionSensor.IOnUpdated
        public native void updateGyroscopeData(float r1, float r2, float r3, long r4);

        @Override // cn.easyar.engine.MotionSensor.IOnUpdated
        public native void updateLinearAccelerationData(float r1, float r2, float r3, long r4);
    }

    public MotionSensor(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "sensor"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.hardware.SensorManager r2 = (android.hardware.SensorManager) r2
            r1.manager_ = r2
            r0 = 9
            android.hardware.Sensor r2 = r2.getDefaultSensor(r0)
            r1.gravitySensor_ = r2
            android.hardware.SensorManager r2 = r1.manager_
            r0 = 10
            android.hardware.Sensor r2 = r2.getDefaultSensor(r0)
            r1.linearAccelerationSensor_ = r2
            android.hardware.SensorManager r2 = r1.manager_
            r0 = 4
            android.hardware.Sensor r2 = r2.getDefaultSensor(r0)
            r1.gyroscopeSensor_ = r2
            android.hardware.SensorManager r2 = r1.manager_
            r0 = 15
            android.hardware.Sensor r2 = r2.getDefaultSensor(r0)
            r1.attitudeSensor_ = r2
            if (r2 != 0) goto L3e
            android.hardware.SensorManager r2 = r1.manager_
            r0 = 11
            android.hardware.Sensor r2 = r2.getDefaultSensor(r0)
            r1.attitudeSensor_ = r2
        L3e:
            return
    }

    static /* synthetic */ android.hardware.SensorManager access$000(cn.easyar.engine.MotionSensor r0) {
            android.hardware.SensorManager r0 = r0.manager_
            return r0
    }

    public boolean isAvailable() {
            r1 = this;
            android.hardware.Sensor r0 = r1.gravitySensor_
            if (r0 == 0) goto L12
            android.hardware.Sensor r0 = r1.linearAccelerationSensor_
            if (r0 == 0) goto L12
            android.hardware.Sensor r0 = r1.gyroscopeSensor_
            if (r0 == 0) goto L12
            android.hardware.Sensor r0 = r1.attitudeSensor_
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public cn.easyar.engine.MotionSensor.IClosable open(int r9, cn.easyar.engine.MotionSensor.IOnUpdated r10) {
            r8 = this;
            boolean r0 = r8.isAvailable()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            cn.easyar.engine.MotionSensor$1 r4 = new cn.easyar.engine.MotionSensor$1
            r4.<init>(r8, r10)
            cn.easyar.engine.MotionSensor$2 r5 = new cn.easyar.engine.MotionSensor$2
            r5.<init>(r8, r10)
            cn.easyar.engine.MotionSensor$3 r6 = new cn.easyar.engine.MotionSensor$3
            r6.<init>(r8, r10)
            cn.easyar.engine.MotionSensor$4 r7 = new cn.easyar.engine.MotionSensor$4
            r7.<init>(r8, r10)
            android.hardware.SensorManager r10 = r8.manager_
            android.hardware.Sensor r0 = r8.gravitySensor_
            boolean r10 = r10.registerListener(r4, r0, r9)
            if (r10 != 0) goto L27
            return r1
        L27:
            android.hardware.SensorManager r10 = r8.manager_
            android.hardware.Sensor r0 = r8.linearAccelerationSensor_
            boolean r10 = r10.registerListener(r5, r0, r9)
            if (r10 != 0) goto L37
            android.hardware.SensorManager r9 = r8.manager_
            r9.unregisterListener(r4)
            return r1
        L37:
            android.hardware.SensorManager r10 = r8.manager_
            android.hardware.Sensor r0 = r8.gyroscopeSensor_
            boolean r10 = r10.registerListener(r6, r0, r9)
            if (r10 != 0) goto L4c
            android.hardware.SensorManager r9 = r8.manager_
            r9.unregisterListener(r4)
            android.hardware.SensorManager r9 = r8.manager_
            r9.unregisterListener(r5)
            return r1
        L4c:
            android.hardware.SensorManager r10 = r8.manager_
            android.hardware.Sensor r0 = r8.attitudeSensor_
            boolean r9 = r10.registerListener(r7, r0, r9)
            if (r9 != 0) goto L66
            android.hardware.SensorManager r9 = r8.manager_
            r9.unregisterListener(r4)
            android.hardware.SensorManager r9 = r8.manager_
            r9.unregisterListener(r5)
            android.hardware.SensorManager r9 = r8.manager_
            r9.unregisterListener(r6)
            return r1
        L66:
            cn.easyar.engine.MotionSensor$5 r2 = new cn.easyar.engine.MotionSensor$5
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
    }
}
