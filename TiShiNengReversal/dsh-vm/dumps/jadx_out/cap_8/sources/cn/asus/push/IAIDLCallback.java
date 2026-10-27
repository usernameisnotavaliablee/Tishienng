package cn.asus.push;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface IAIDLCallback extends android.os.IInterface {

    public class Default implements cn.asus.push.IAIDLCallback {
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

        @Override // cn.asus.push.IAIDLCallback
        public void call(cn.asus.push.DataBuffer r1) {
                r0 = this;
                return
        }
    }

    public abstract class Stub extends android.os.Binder implements cn.asus.push.IAIDLCallback {
        private static final java.lang.String DESCRIPTOR = "cn.asus.push.IAIDLCallback";
        static final int TRANSACTION_call = 1;

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "cn.asus.push.IAIDLCallback"
                r1.attachInterface(r1, r0)
                return
        }

        public static cn.asus.push.IAIDLCallback asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "cn.asus.push.IAIDLCallback"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof cn.asus.push.IAIDLCallback
                if (r1 == 0) goto L13
                cn.asus.push.IAIDLCallback r0 = (cn.asus.push.IAIDLCallback) r0
                return r0
            L13:
                cn.asus.push.c r0 = new cn.asus.push.c
                r0.<init>(r2)
                return r0
        }

        public static cn.asus.push.IAIDLCallback getDefaultImpl() {
                cn.asus.push.IAIDLCallback r0 = cn.asus.push.c.f11b
                return r0
        }

        public static boolean setDefaultImpl(cn.asus.push.IAIDLCallback r1) {
                cn.asus.push.IAIDLCallback r0 = cn.asus.push.c.f11b
                if (r0 != 0) goto La
                if (r1 == 0) goto La
                cn.asus.push.c.f11b = r1
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
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
                r3 = this;
                java.lang.String r0 = "cn.asus.push.IAIDLCallback"
                r1 = 1
                if (r4 == r1) goto L13
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 == r2) goto Lf
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            Lf:
                r6.writeString(r0)
                return r1
            L13:
                r5.enforceInterface(r0)
                int r4 = r5.readInt()
                if (r4 == 0) goto L25
                android.os.Parcelable$Creator<cn.asus.push.DataBuffer> r4 = cn.asus.push.DataBuffer.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                cn.asus.push.DataBuffer r4 = (cn.asus.push.DataBuffer) r4
                goto L26
            L25:
                r4 = 0
            L26:
                r3.call(r4)
                return r1
        }
    }

    void call(cn.asus.push.DataBuffer r1);
}
