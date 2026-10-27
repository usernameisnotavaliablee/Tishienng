package cn.asus.push;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface IAIDLInvoke extends android.os.IInterface {

    public class Default implements cn.asus.push.IAIDLInvoke {
        public Default() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // cn.asus.push.IAIDLInvoke
        public void c(cn.asus.push.DataBuffer r1) {
                r0 = this;
                return
        }

        @Override // cn.asus.push.IAIDLInvoke
        public void d(cn.asus.push.DataBuffer r1, cn.asus.push.IAIDLCallback r2) {
                r0 = this;
                return
        }
    }

    public abstract class Stub extends android.os.Binder implements cn.asus.push.IAIDLInvoke {
        private static final java.lang.String a = "cn.asus.push.IAIDLInvoke";

        /* renamed from: b, reason: collision with root package name */
        static final int f4b = 1;

        /* renamed from: c, reason: collision with root package name */
        static final int f5c = 2;

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "cn.asus.push.IAIDLInvoke"
                r1.attachInterface(r1, r0)
                return
        }

        public static cn.asus.push.IAIDLInvoke e(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "cn.asus.push.IAIDLInvoke"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof cn.asus.push.IAIDLInvoke
                if (r1 == 0) goto L13
                cn.asus.push.IAIDLInvoke r0 = (cn.asus.push.IAIDLInvoke) r0
                return r0
            L13:
                cn.asus.push.d r0 = new cn.asus.push.d
                r0.<init>(r2)
                return r0
        }

        public static cn.asus.push.IAIDLInvoke f() {
                cn.asus.push.IAIDLInvoke r0 = cn.asus.push.d.f12b
                return r0
        }

        public static boolean g(cn.asus.push.IAIDLInvoke r1) {
                cn.asus.push.IAIDLInvoke r0 = cn.asus.push.d.f12b
                if (r0 != 0) goto La
                if (r1 == 0) goto La
                cn.asus.push.d.f12b = r1
                r1 = 1
                return r1
            La:
                r1 = 0
                return r1
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
                r4 = this;
                r0 = 0
                java.lang.String r1 = "cn.asus.push.IAIDLInvoke"
                r2 = 1
                if (r5 == r2) goto L35
                r3 = 2
                if (r5 == r3) goto L17
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r0) goto L13
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L13:
                r7.writeString(r1)
                return r2
            L17:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L29
                android.os.Parcelable$Creator<cn.asus.push.DataBuffer> r5 = cn.asus.push.DataBuffer.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r0 = r5
                cn.asus.push.DataBuffer r0 = (cn.asus.push.DataBuffer) r0
            L29:
                android.os.IBinder r5 = r6.readStrongBinder()
                cn.asus.push.IAIDLCallback r5 = cn.asus.push.IAIDLCallback.Stub.asInterface(r5)
                r4.d(r0, r5)
                return r2
            L35:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L47
                android.os.Parcelable$Creator<cn.asus.push.DataBuffer> r5 = cn.asus.push.DataBuffer.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r0 = r5
                cn.asus.push.DataBuffer r0 = (cn.asus.push.DataBuffer) r0
            L47:
                r4.c(r0)
                r7.writeNoException()
                return r2
        }
    }

    void c(cn.asus.push.DataBuffer r1);

    void d(cn.asus.push.DataBuffer r1, cn.asus.push.IAIDLCallback r2);
}
