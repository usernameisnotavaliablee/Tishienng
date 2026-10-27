package net.sqlcipher;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class CursorWindow extends android.database.CursorWindow implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<net.sqlcipher.CursorWindow> CREATOR = null;
    private static net.sqlcipher.CursorWindowAllocation allocation;
    private int mRequiredPos;
    private int mStartPos;
    private long nWindow;


    static {
            net.sqlcipher.DefaultCursorWindowAllocation r0 = new net.sqlcipher.DefaultCursorWindowAllocation
            r0.<init>()
            net.sqlcipher.CursorWindow.allocation = r0
            net.sqlcipher.CursorWindow$1 r0 = new net.sqlcipher.CursorWindow$1
            r0.<init>()
            net.sqlcipher.CursorWindow.CREATOR = r0
            return
    }

    public CursorWindow(android.os.Parcel r1, int r2) {
            r0 = this;
            r2 = 1
            r0.<init>(r2)
            android.os.IBinder r2 = r1.readStrongBinder()
            int r1 = r1.readInt()
            r0.mStartPos = r1
            r0.native_init(r2)
            return
    }

    public CursorWindow(boolean r10) {
            r9 = this;
            r9.<init>(r10)
            r0 = 0
            r9.mStartPos = r0
            net.sqlcipher.CursorWindowAllocation r0 = net.sqlcipher.CursorWindow.allocation
            if (r0 != 0) goto L11
            net.sqlcipher.DefaultCursorWindowAllocation r0 = new net.sqlcipher.DefaultCursorWindowAllocation
            r0.<init>()
            net.sqlcipher.CursorWindow.allocation = r0
        L11:
            net.sqlcipher.CursorWindowAllocation r0 = net.sqlcipher.CursorWindow.allocation
            long r3 = r0.getInitialAllocationSize()
            net.sqlcipher.CursorWindowAllocation r0 = net.sqlcipher.CursorWindow.allocation
            long r5 = r0.getGrowthPaddingSize()
            net.sqlcipher.CursorWindowAllocation r0 = net.sqlcipher.CursorWindow.allocation
            long r7 = r0.getMaxAllocationSize()
            r1 = r9
            r2 = r10
            r1.native_init(r2, r3, r5, r7)
            return
    }

    private native boolean allocRow_native();

    private native void close_native();

    private native char[] copyStringToBuffer_native(int r1, int r2, int r3, android.database.CharArrayBuffer r4);

    private native void freeLastRow_native();

    private native byte[] getBlob_native(int r1, int r2);

    public static net.sqlcipher.CursorWindowAllocation getCursorWindowAllocation() {
            net.sqlcipher.CursorWindowAllocation r0 = net.sqlcipher.CursorWindow.allocation
            return r0
    }

    private native double getDouble_native(int r1, int r2);

    private native long getLong_native(int r1, int r2);

    private native int getNumRows_native();

    private native java.lang.String getString_native(int r1, int r2);

    private native int getType_native(int r1, int r2);

    private native boolean isBlob_native(int r1, int r2);

    private native boolean isFloat_native(int r1, int r2);

    private native boolean isInteger_native(int r1, int r2);

    private native boolean isNull_native(int r1, int r2);

    private native boolean isString_native(int r1, int r2);

    private native void native_clear();

    private native android.os.IBinder native_getBinder();

    private native void native_init(android.os.IBinder r1);

    private native void native_init(boolean r1, long r2, long r4, long r6);

    public static net.sqlcipher.CursorWindow newFromParcel(android.os.Parcel r1) {
            android.os.Parcelable$Creator<net.sqlcipher.CursorWindow> r0 = net.sqlcipher.CursorWindow.CREATOR
            java.lang.Object r1 = r0.createFromParcel(r1)
            net.sqlcipher.CursorWindow r1 = (net.sqlcipher.CursorWindow) r1
            return r1
    }

    private native boolean putBlob_native(byte[] r1, int r2, int r3);

    private native boolean putDouble_native(double r1, int r3, int r4);

    private native boolean putLong_native(long r1, int r3, int r4);

    private native boolean putNull_native(int r1, int r2);

    private native boolean putString_native(java.lang.String r1, int r2, int r3);

    public static void setCursorWindowAllocation(net.sqlcipher.CursorWindowAllocation r0) {
            net.sqlcipher.CursorWindow.allocation = r0
            return
    }

    private native boolean setNumColumns_native(int r1);

    @Override // android.database.CursorWindow
    public boolean allocRow() {
            r1 = this;
            r1.acquireReference()
            boolean r0 = r1.allocRow_native()     // Catch: java.lang.Throwable -> Lb
            r1.releaseReference()
            return r0
        Lb:
            r0 = move-exception
            r1.releaseReference()
            throw r0
    }

    @Override // android.database.CursorWindow
    public void clear() {
            r1 = this;
            r1.acquireReference()
            r0 = 0
            r1.mStartPos = r0     // Catch: java.lang.Throwable -> Ld
            r1.native_clear()     // Catch: java.lang.Throwable -> Ld
            r1.releaseReference()
            return
        Ld:
            r0 = move-exception
            r1.releaseReference()
            throw r0
    }

    @Override // android.database.sqlite.SQLiteClosable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            r0.releaseReference()
            return
    }

    @Override // android.database.CursorWindow
    public void copyStringToBuffer(int r2, int r3, android.database.CharArrayBuffer r4) {
            r1 = this;
            if (r4 == 0) goto L28
            char[] r0 = r4.data
            if (r0 != 0) goto Lc
            r0 = 64
            char[] r0 = new char[r0]
            r4.data = r0
        Lc:
            r1.acquireReference()
            int r0 = r1.mStartPos     // Catch: java.lang.Throwable -> L1e
            int r2 = r2 - r0
            char[] r0 = r4.data     // Catch: java.lang.Throwable -> L1e
            int r0 = r0.length     // Catch: java.lang.Throwable -> L1e
            char[] r2 = r1.copyStringToBuffer_native(r2, r3, r0, r4)     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L20
            r4.data = r2     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r2 = move-exception
            goto L24
        L20:
            r1.releaseReference()
            return
        L24:
            r1.releaseReference()
            throw r2
        L28:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "CharArrayBuffer should not be null"
            r2.<init>(r3)
            throw r2
    }

    @Override // android.database.CursorWindow, android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.database.CursorWindow
    protected void finalize() {
            r5 = this;
            long r0 = r5.nWindow
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            return
        L9:
            r5.close_native()
            return
    }

    @Override // android.database.CursorWindow
    public void freeLastRow() {
            r1 = this;
            r1.acquireReference()
            r1.freeLastRow_native()     // Catch: java.lang.Throwable -> La
            r1.releaseReference()
            return
        La:
            r0 = move-exception
            r1.releaseReference()
            throw r0
    }

    @Override // android.database.CursorWindow
    public byte[] getBlob(int r2, int r3) {
            r1 = this;
            r1.acquireReference()
            int r0 = r1.mStartPos     // Catch: java.lang.Throwable -> Le
            int r2 = r2 - r0
            byte[] r2 = r1.getBlob_native(r2, r3)     // Catch: java.lang.Throwable -> Le
            r1.releaseReference()
            return r2
        Le:
            r2 = move-exception
            r1.releaseReference()
            throw r2
    }

    @Override // android.database.CursorWindow
    public double getDouble(int r2, int r3) {
            r1 = this;
            r1.acquireReference()
            int r0 = r1.mStartPos     // Catch: java.lang.Throwable -> Le
            int r2 = r2 - r0
            double r2 = r1.getDouble_native(r2, r3)     // Catch: java.lang.Throwable -> Le
            r1.releaseReference()
            return r2
        Le:
            r2 = move-exception
            r1.releaseReference()
            throw r2
    }

    @Override // android.database.CursorWindow
    public float getFloat(int r2, int r3) {
            r1 = this;
            r1.acquireReference()
            int r0 = r1.mStartPos     // Catch: java.lang.Throwable -> Lf
            int r2 = r2 - r0
            double r2 = r1.getDouble_native(r2, r3)     // Catch: java.lang.Throwable -> Lf
            float r2 = (float) r2
            r1.releaseReference()
            return r2
        Lf:
            r2 = move-exception
            r1.releaseReference()
            throw r2
    }

    @Override // android.database.CursorWindow
    public int getInt(int r2, int r3) {
            r1 = this;
            r1.acquireReference()
            int r0 = r1.mStartPos     // Catch: java.lang.Throwable -> Lf
            int r2 = r2 - r0
            long r2 = r1.getLong_native(r2, r3)     // Catch: java.lang.Throwable -> Lf
            int r3 = (int) r2
            r1.releaseReference()
            return r3
        Lf:
            r2 = move-exception
            r1.releaseReference()
            throw r2
    }

    @Override // android.database.CursorWindow
    public long getLong(int r2, int r3) {
            r1 = this;
            r1.acquireReference()
            int r0 = r1.mStartPos     // Catch: java.lang.Throwable -> Le
            int r2 = r2 - r0
            long r2 = r1.getLong_native(r2, r3)     // Catch: java.lang.Throwable -> Le
            r1.releaseReference()
            return r2
        Le:
            r2 = move-exception
            r1.releaseReference()
            throw r2
    }

    @Override // android.database.CursorWindow
    public int getNumRows() {
            r1 = this;
            r1.acquireReference()
            int r0 = r1.getNumRows_native()     // Catch: java.lang.Throwable -> Lb
            r1.releaseReference()
            return r0
        Lb:
            r0 = move-exception
            r1.releaseReference()
            throw r0
    }

    public int getRequiredPosition() {
            r1 = this;
            int r0 = r1.mRequiredPos
            return r0
    }

    @Override // android.database.CursorWindow
    public short getShort(int r2, int r3) {
            r1 = this;
            r1.acquireReference()
            int r0 = r1.mStartPos     // Catch: java.lang.Throwable -> L10
            int r2 = r2 - r0
            long r2 = r1.getLong_native(r2, r3)     // Catch: java.lang.Throwable -> L10
            int r3 = (int) r2
            short r2 = (short) r3
            r1.releaseReference()
            return r2
        L10:
            r2 = move-exception
            r1.releaseReference()
            throw r2
    }

    @Override // android.database.CursorWindow
    public int getStartPosition() {
            r1 = this;
            int r0 = r1.mStartPos
            return r0
    }

    @Override // android.database.CursorWindow
    public java.lang.String getString(int r2, int r3) {
            r1 = this;
            r1.acquireReference()
            int r0 = r1.mStartPos     // Catch: java.lang.Throwable -> Le
            int r2 = r2 - r0
            java.lang.String r2 = r1.getString_native(r2, r3)     // Catch: java.lang.Throwable -> Le
            r1.releaseReference()
            return r2
        Le:
            r2 = move-exception
            r1.releaseReference()
            throw r2
    }

    @Override // android.database.CursorWindow
    public int getType(int r2, int r3) {
            r1 = this;
            r1.acquireReference()
            int r0 = r1.mStartPos     // Catch: java.lang.Throwable -> Le
            int r2 = r2 - r0
            int r2 = r1.getType_native(r2, r3)     // Catch: java.lang.Throwable -> Le
            r1.releaseReference()
            return r2
        Le:
            r2 = move-exception
            r1.releaseReference()
            throw r2
    }

    @Override // android.database.CursorWindow
    public boolean isBlob(int r2, int r3) {
            r1 = this;
            r1.acquireReference()
            int r0 = r1.mStartPos     // Catch: java.lang.Throwable -> Le
            int r2 = r2 - r0
            boolean r2 = r1.isBlob_native(r2, r3)     // Catch: java.lang.Throwable -> Le
            r1.releaseReference()
            return r2
        Le:
            r2 = move-exception
            r1.releaseReference()
            throw r2
    }

    @Override // android.database.CursorWindow
    public boolean isFloat(int r2, int r3) {
            r1 = this;
            r1.acquireReference()
            int r0 = r1.mStartPos     // Catch: java.lang.Throwable -> Le
            int r2 = r2 - r0
            boolean r2 = r1.isFloat_native(r2, r3)     // Catch: java.lang.Throwable -> Le
            r1.releaseReference()
            return r2
        Le:
            r2 = move-exception
            r1.releaseReference()
            throw r2
    }

    @Override // android.database.CursorWindow
    public boolean isLong(int r2, int r3) {
            r1 = this;
            r1.acquireReference()
            int r0 = r1.mStartPos     // Catch: java.lang.Throwable -> Le
            int r2 = r2 - r0
            boolean r2 = r1.isInteger_native(r2, r3)     // Catch: java.lang.Throwable -> Le
            r1.releaseReference()
            return r2
        Le:
            r2 = move-exception
            r1.releaseReference()
            throw r2
    }

    @Override // android.database.CursorWindow
    public boolean isNull(int r2, int r3) {
            r1 = this;
            r1.acquireReference()
            int r0 = r1.mStartPos     // Catch: java.lang.Throwable -> Le
            int r2 = r2 - r0
            boolean r2 = r1.isNull_native(r2, r3)     // Catch: java.lang.Throwable -> Le
            r1.releaseReference()
            return r2
        Le:
            r2 = move-exception
            r1.releaseReference()
            throw r2
    }

    @Override // android.database.CursorWindow
    public boolean isString(int r2, int r3) {
            r1 = this;
            r1.acquireReference()
            int r0 = r1.mStartPos     // Catch: java.lang.Throwable -> Le
            int r2 = r2 - r0
            boolean r2 = r1.isString_native(r2, r3)     // Catch: java.lang.Throwable -> Le
            r1.releaseReference()
            return r2
        Le:
            r2 = move-exception
            r1.releaseReference()
            throw r2
    }

    @Override // android.database.CursorWindow, android.database.sqlite.SQLiteClosable
    protected void onAllReferencesReleased() {
            r0 = this;
            r0.close_native()
            super.onAllReferencesReleased()
            return
    }

    @Override // android.database.CursorWindow
    public boolean putBlob(byte[] r2, int r3, int r4) {
            r1 = this;
            r1.acquireReference()
            int r0 = r1.mStartPos     // Catch: java.lang.Throwable -> Le
            int r3 = r3 - r0
            boolean r2 = r1.putBlob_native(r2, r3, r4)     // Catch: java.lang.Throwable -> Le
            r1.releaseReference()
            return r2
        Le:
            r2 = move-exception
            r1.releaseReference()
            throw r2
    }

    @Override // android.database.CursorWindow
    public boolean putDouble(double r2, int r4, int r5) {
            r1 = this;
            r1.acquireReference()
            int r0 = r1.mStartPos     // Catch: java.lang.Throwable -> Le
            int r4 = r4 - r0
            boolean r2 = r1.putDouble_native(r2, r4, r5)     // Catch: java.lang.Throwable -> Le
            r1.releaseReference()
            return r2
        Le:
            r2 = move-exception
            r1.releaseReference()
            throw r2
    }

    @Override // android.database.CursorWindow
    public boolean putLong(long r2, int r4, int r5) {
            r1 = this;
            r1.acquireReference()
            int r0 = r1.mStartPos     // Catch: java.lang.Throwable -> Le
            int r4 = r4 - r0
            boolean r2 = r1.putLong_native(r2, r4, r5)     // Catch: java.lang.Throwable -> Le
            r1.releaseReference()
            return r2
        Le:
            r2 = move-exception
            r1.releaseReference()
            throw r2
    }

    @Override // android.database.CursorWindow
    public boolean putNull(int r2, int r3) {
            r1 = this;
            r1.acquireReference()
            int r0 = r1.mStartPos     // Catch: java.lang.Throwable -> Le
            int r2 = r2 - r0
            boolean r2 = r1.putNull_native(r2, r3)     // Catch: java.lang.Throwable -> Le
            r1.releaseReference()
            return r2
        Le:
            r2 = move-exception
            r1.releaseReference()
            throw r2
    }

    @Override // android.database.CursorWindow
    public boolean putString(java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.acquireReference()
            int r0 = r1.mStartPos     // Catch: java.lang.Throwable -> Le
            int r3 = r3 - r0
            boolean r2 = r1.putString_native(r2, r3, r4)     // Catch: java.lang.Throwable -> Le
            r1.releaseReference()
            return r2
        Le:
            r2 = move-exception
            r1.releaseReference()
            throw r2
    }

    @Override // android.database.CursorWindow
    public boolean setNumColumns(int r1) {
            r0 = this;
            r0.acquireReference()
            boolean r1 = r0.setNumColumns_native(r1)     // Catch: java.lang.Throwable -> Lb
            r0.releaseReference()
            return r1
        Lb:
            r1 = move-exception
            r0.releaseReference()
            throw r1
    }

    public void setRequiredPosition(int r1) {
            r0 = this;
            r0.mRequiredPos = r1
            return
    }

    @Override // android.database.CursorWindow
    public void setStartPosition(int r1) {
            r0 = this;
            r0.mStartPos = r1
            return
    }

    @Override // android.database.CursorWindow, android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            android.os.IBinder r2 = r0.native_getBinder()
            r1.writeStrongBinder(r2)
            int r2 = r0.mStartPos
            r1.writeInt(r2)
            return
    }
}
