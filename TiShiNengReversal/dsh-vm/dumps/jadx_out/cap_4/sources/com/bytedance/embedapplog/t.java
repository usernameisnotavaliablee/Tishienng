package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface t extends android.os.IInterface {

    public static abstract class j extends android.os.Binder implements com.bytedance.embedapplog.t {

        /* renamed from: com.bytedance.embedapplog.t$j$j, reason: collision with other inner class name */
        static class C0206j implements com.bytedance.embedapplog.t {
            public static com.bytedance.embedapplog.t j;
            private android.os.IBinder xt;

            C0206j(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.xt = r1
                    return
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.xt
                    return r0
            }

            @Override // com.bytedance.embedapplog.t
            public void j(int r13, long r14, boolean r16, float r17, double r18, java.lang.String r20) {
                    r12 = this;
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    android.os.Parcel r2 = android.os.Parcel.obtain()
                    java.lang.String r0 = "com.hihonor.cloudservice.oaid.IOAIDService"
                    r1.writeInterfaceToken(r0)     // Catch: java.lang.Throwable -> L47
                    r1.writeInt(r13)     // Catch: java.lang.Throwable -> L47
                    r1.writeLong(r14)     // Catch: java.lang.Throwable -> L47
                    r7 = r16
                    r1.writeInt(r7)     // Catch: java.lang.Throwable -> L47
                    r8 = r17
                    r1.writeFloat(r8)     // Catch: java.lang.Throwable -> L47
                    r9 = r18
                    r1.writeDouble(r9)     // Catch: java.lang.Throwable -> L47
                    r11 = r20
                    r1.writeString(r11)     // Catch: java.lang.Throwable -> L47
                    android.os.IBinder r0 = r12.xt     // Catch: java.lang.Throwable -> L47
                    r3 = 1
                    r4 = 0
                    boolean r0 = r0.transact(r3, r1, r2, r4)     // Catch: java.lang.Throwable -> L47
                    if (r0 != 0) goto L4a
                    com.bytedance.embedapplog.t r0 = com.bytedance.embedapplog.t.j.j()     // Catch: java.lang.Throwable -> L47
                    if (r0 == 0) goto L4a
                    com.bytedance.embedapplog.t r3 = com.bytedance.embedapplog.t.j.j()     // Catch: java.lang.Throwable -> L47
                    r4 = r13
                    r5 = r14
                    r3.j(r4, r5, r7, r8, r9, r11)     // Catch: java.lang.Throwable -> L47
                L40:
                    r2.recycle()
                    r1.recycle()
                    return
                L47:
                    r0 = move-exception
                    r13 = r0
                    goto L4e
                L4a:
                    r2.readException()     // Catch: java.lang.Throwable -> L47
                    goto L40
                L4e:
                    r2.recycle()
                    r1.recycle()
                    throw r13
            }

            @Override // com.bytedance.embedapplog.t
            public void j(com.bytedance.embedapplog.ki r6) {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.hihonor.cloudservice.oaid.IOAIDService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L14
                    if (r6 == 0) goto L16
                    android.os.IBinder r2 = r6.asBinder()     // Catch: java.lang.Throwable -> L14
                    goto L17
                L14:
                    r6 = move-exception
                    goto L3c
                L16:
                    r2 = 0
                L17:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L14
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L14
                    r3 = 2
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L14
                    if (r2 != 0) goto L38
                    com.bytedance.embedapplog.t r2 = com.bytedance.embedapplog.t.j.j()     // Catch: java.lang.Throwable -> L14
                    if (r2 == 0) goto L38
                    com.bytedance.embedapplog.t r2 = com.bytedance.embedapplog.t.j.j()     // Catch: java.lang.Throwable -> L14
                    r2.j(r6)     // Catch: java.lang.Throwable -> L14
                L31:
                    r1.recycle()
                    r0.recycle()
                    return
                L38:
                    r1.readException()     // Catch: java.lang.Throwable -> L14
                    goto L31
                L3c:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.bytedance.embedapplog.t
            public void xt(com.bytedance.embedapplog.ki r6) {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.hihonor.cloudservice.oaid.IOAIDService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L14
                    if (r6 == 0) goto L16
                    android.os.IBinder r2 = r6.asBinder()     // Catch: java.lang.Throwable -> L14
                    goto L17
                L14:
                    r6 = move-exception
                    goto L3c
                L16:
                    r2 = 0
                L17:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L14
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L14
                    r3 = 3
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L14
                    if (r2 != 0) goto L38
                    com.bytedance.embedapplog.t r2 = com.bytedance.embedapplog.t.j.j()     // Catch: java.lang.Throwable -> L14
                    if (r2 == 0) goto L38
                    com.bytedance.embedapplog.t r2 = com.bytedance.embedapplog.t.j.j()     // Catch: java.lang.Throwable -> L14
                    r2.xt(r6)     // Catch: java.lang.Throwable -> L14
                L31:
                    r1.recycle()
                    r0.recycle()
                    return
                L38:
                    r1.readException()     // Catch: java.lang.Throwable -> L14
                    goto L31
                L3c:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }
        }

        public static com.bytedance.embedapplog.t j() {
                com.bytedance.embedapplog.t r0 = com.bytedance.embedapplog.t.j.C0206j.j
                return r0
        }

        public static com.bytedance.embedapplog.t j(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.hihonor.cloudservice.oaid.IOAIDService"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.bytedance.embedapplog.t
                if (r1 == 0) goto L13
                com.bytedance.embedapplog.t r0 = (com.bytedance.embedapplog.t) r0
                return r0
            L13:
                com.bytedance.embedapplog.t$j$j r0 = new com.bytedance.embedapplog.t$j$j
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r12, android.os.Parcel r13, android.os.Parcel r14, int r15) {
                r11 = this;
                java.lang.String r0 = "com.hihonor.cloudservice.oaid.IOAIDService"
                r1 = 1
                if (r12 == r1) goto L3d
                r2 = 2
                if (r12 == r2) goto L2b
                r2 = 3
                if (r12 == r2) goto L19
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r12 == r2) goto L15
                boolean r12 = super.onTransact(r12, r13, r14, r15)
                return r12
            L15:
                r14.writeString(r0)
                return r1
            L19:
                r13.enforceInterface(r0)
                android.os.IBinder r12 = r13.readStrongBinder()
                com.bytedance.embedapplog.ki r12 = com.bytedance.embedapplog.ki.j.j(r12)
                r11.xt(r12)
                r14.writeNoException()
                return r1
            L2b:
                r13.enforceInterface(r0)
                android.os.IBinder r12 = r13.readStrongBinder()
                com.bytedance.embedapplog.ki r12 = com.bytedance.embedapplog.ki.j.j(r12)
                r11.j(r12)
                r14.writeNoException()
                return r1
            L3d:
                r13.enforceInterface(r0)
                int r3 = r13.readInt()
                long r4 = r13.readLong()
                int r12 = r13.readInt()
                if (r12 == 0) goto L50
                r6 = 1
                goto L52
            L50:
                r12 = 0
                r6 = 0
            L52:
                float r7 = r13.readFloat()
                double r8 = r13.readDouble()
                java.lang.String r10 = r13.readString()
                r2 = r11
                r2.j(r3, r4, r6, r7, r8, r10)
                r14.writeNoException()
                return r1
        }
    }

    void j(int r1, long r2, boolean r4, float r5, double r6, java.lang.String r8);

    void j(com.bytedance.embedapplog.ki r1);

    void xt(com.bytedance.embedapplog.ki r1);
}
