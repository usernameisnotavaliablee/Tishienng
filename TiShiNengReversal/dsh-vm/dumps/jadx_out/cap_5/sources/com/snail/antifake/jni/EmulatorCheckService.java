package com.snail.antifake.jni;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class EmulatorCheckService extends android.app.Service {
    android.os.Handler a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends com.snail.antifake.IEmulatorCheck.Stub {
        final /* synthetic */ com.snail.antifake.jni.EmulatorCheckService d;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.snail.antifake.jni.EmulatorCheckService$a$a, reason: collision with other inner class name */
        class RunnableC0186a implements java.lang.Runnable {
            final /* synthetic */ com.snail.antifake.jni.EmulatorCheckService.a a;

            RunnableC0186a(com.snail.antifake.jni.EmulatorCheckService.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r1 = this;
                    r0 = 0
                    java.lang.System.exit(r0)
                    return
            }
        }

        a(com.snail.antifake.jni.EmulatorCheckService r1) {
                r0 = this;
                r0.d = r1
                r0.<init>()
                return
        }

        @Override // com.snail.antifake.IEmulatorCheck
        public boolean w() throws android.os.RemoteException {
                r1 = this;
                com.snail.antifake.jni.EmulatorCheckService r0 = r1.d
                boolean r0 = com.snail.antifake.jni.EmulatorDetectUtil.b(r0)
                return r0
        }

        @Override // com.snail.antifake.IEmulatorCheck
        public void x() throws android.os.RemoteException {
                r4 = this;
                com.snail.antifake.jni.EmulatorCheckService r0 = r4.d
                r0.stopSelf()
                com.snail.antifake.jni.EmulatorCheckService r0 = r4.d
                android.os.Handler r0 = r0.a
                com.snail.antifake.jni.EmulatorCheckService$a$a r1 = new com.snail.antifake.jni.EmulatorCheckService$a$a
                r1.<init>(r4)
                r2 = 500(0x1f4, double:2.47E-321)
                r0.postDelayed(r1, r2)
                return
        }
    }

    public EmulatorCheckService() {
            r1 = this;
            r1.<init>()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r1.a = r0
            return
    }

    @Override // android.app.Service
    @androidx.annotation.Nullable
    public android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            com.snail.antifake.jni.EmulatorCheckService$a r1 = new com.snail.antifake.jni.EmulatorCheckService$a
            r1.<init>(r0)
            return r1
    }

    @Override // android.app.Service
    public void onCreate() {
            r0 = this;
            super.onCreate()
            return
    }
}
