package androidx.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class CallbackRegistry<C, T, A> implements java.lang.Cloneable {
    private static final java.lang.String TAG = "CallbackRegistry";
    private java.util.List<C> mCallbacks;
    private long mFirst64Removed;
    private int mNotificationLevel;
    private final androidx.databinding.CallbackRegistry.NotifierCallback<C, T, A> mNotifier;
    private long[] mRemainderRemoved;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class NotifierCallback<C, T, A> {
        public NotifierCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract void onNotifyCallback(C r1, T r2, int r3, A r4);
    }

    public CallbackRegistry(androidx.databinding.CallbackRegistry.NotifierCallback<C, T, A> r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mCallbacks = r0
            r0 = 0
            r2.mFirst64Removed = r0
            r2.mNotifier = r3
            return
    }

    private boolean isRemoved(int r11) {
            r10 = this;
            r0 = 0
            r2 = 1
            r4 = 1
            r5 = 0
            r6 = 64
            if (r11 >= r6) goto L14
            long r2 = r2 << r11
            long r6 = r10.mFirst64Removed
            long r2 = r2 & r6
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 == 0) goto L13
            return r4
        L13:
            return r5
        L14:
            long[] r7 = r10.mRemainderRemoved
            if (r7 != 0) goto L19
            return r5
        L19:
            int r8 = r11 / 64
            int r8 = r8 - r4
            int r9 = r7.length
            if (r8 < r9) goto L20
            return r5
        L20:
            r8 = r7[r8]
            int r11 = r11 % r6
            long r2 = r2 << r11
            long r2 = r2 & r8
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 == 0) goto L2a
            return r4
        L2a:
            return r5
    }

    private void notifyCallbacks(T r8, int r9, A r10, int r11, int r12, long r13) {
            r7 = this;
            r0 = 1
        L2:
            if (r11 >= r12) goto L1c
            long r2 = r13 & r0
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L17
            androidx.databinding.CallbackRegistry$NotifierCallback<C, T, A> r2 = r7.mNotifier
            java.util.List<C> r3 = r7.mCallbacks
            java.lang.Object r3 = r3.get(r11)
            r2.onNotifyCallback(r3, r8, r9, r10)
        L17:
            r2 = 1
            long r0 = r0 << r2
            int r11 = r11 + 1
            goto L2
        L1c:
            return
    }

    private void notifyFirst64(T r11, int r12, A r13) {
            r10 = this;
            java.util.List<C> r0 = r10.mCallbacks
            int r0 = r0.size()
            r1 = 64
            int r7 = java.lang.Math.min(r1, r0)
            r6 = 0
            long r8 = r10.mFirst64Removed
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r2.notifyCallbacks(r3, r4, r5, r6, r7, r8)
            return
    }

    private void notifyRecurse(T r10, int r11, A r12) {
            r9 = this;
            java.util.List<C> r0 = r9.mCallbacks
            int r6 = r0.size()
            long[] r0 = r9.mRemainderRemoved
            if (r0 != 0) goto Lc
            r0 = -1
            goto Lf
        Lc:
            int r0 = r0.length
            int r0 = r0 + (-1)
        Lf:
            r9.notifyRemainder(r10, r11, r12, r0)
            int r0 = r0 + 2
            int r5 = r0 * 64
            r7 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r1.notifyCallbacks(r2, r3, r4, r5, r6, r7)
            return
    }

    private void notifyRemainder(T r10, int r11, A r12, int r13) {
            r9 = this;
            if (r13 >= 0) goto L6
            r9.notifyFirst64(r10, r11, r12)
            return
        L6:
            long[] r0 = r9.mRemainderRemoved
            r7 = r0[r13]
            int r0 = r13 + 1
            int r5 = r0 * 64
            java.util.List<C> r0 = r9.mCallbacks
            int r0 = r0.size()
            int r1 = r5 + 64
            int r6 = java.lang.Math.min(r0, r1)
            int r13 = r13 + (-1)
            r9.notifyRemainder(r10, r11, r12, r13)
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r1.notifyCallbacks(r2, r3, r4, r5, r6, r7)
            return
    }

    private void removeRemovedCallbacks(int r9, long r10) {
            r8 = this;
            int r0 = r9 + 63
            r1 = -9223372036854775808
        L4:
            if (r0 < r9) goto L18
            long r3 = r10 & r1
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L13
            java.util.List<C> r3 = r8.mCallbacks
            r3.remove(r0)
        L13:
            r3 = 1
            long r1 = r1 >>> r3
            int r0 = r0 + (-1)
            goto L4
        L18:
            return
    }

    private void setRemovalBit(int r9) {
            r8 = this;
            r0 = 1
            r2 = 64
            if (r9 >= r2) goto Ld
            long r0 = r0 << r9
            long r2 = r8.mFirst64Removed
            long r0 = r0 | r2
            r8.mFirst64Removed = r0
            return
        Ld:
            int r3 = r9 / 64
            int r3 = r3 + (-1)
            long[] r4 = r8.mRemainderRemoved
            if (r4 != 0) goto L21
            java.util.List<C> r4 = r8.mCallbacks
            int r4 = r4.size()
            int r4 = r4 / r2
            long[] r4 = new long[r4]
            r8.mRemainderRemoved = r4
            goto L36
        L21:
            int r4 = r4.length
            if (r4 > r3) goto L36
            java.util.List<C> r4 = r8.mCallbacks
            int r4 = r4.size()
            int r4 = r4 / r2
            long[] r4 = new long[r4]
            long[] r5 = r8.mRemainderRemoved
            int r6 = r5.length
            r7 = 0
            java.lang.System.arraycopy(r5, r7, r4, r7, r6)
            r8.mRemainderRemoved = r4
        L36:
            int r9 = r9 % r2
            long r0 = r0 << r9
            long[] r9 = r8.mRemainderRemoved
            r4 = r9[r3]
            long r0 = r0 | r4
            r9[r3] = r0
            return
    }

    public synchronized void add(C r2) {
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L1b
            java.util.List<C> r0 = r1.mCallbacks     // Catch: java.lang.Throwable -> L12
            int r0 = r0.lastIndexOf(r2)     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L14
            boolean r0 = r1.isRemoved(r0)     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L19
            goto L14
        L12:
            r2 = move-exception
            goto L23
        L14:
            java.util.List<C> r0 = r1.mCallbacks     // Catch: java.lang.Throwable -> L12
            r0.add(r2)     // Catch: java.lang.Throwable -> L12
        L19:
            monitor-exit(r1)
            return
        L1b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = "callback cannot be null"
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r2     // Catch: java.lang.Throwable -> L12
        L23:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    public synchronized void clear() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.mNotificationLevel     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto Ld
            java.util.List<C> r0 = r1.mCallbacks     // Catch: java.lang.Throwable -> Lb
            r0.clear()     // Catch: java.lang.Throwable -> Lb
            goto L25
        Lb:
            r0 = move-exception
            goto L27
        Ld:
            java.util.List<C> r0 = r1.mCallbacks     // Catch: java.lang.Throwable -> Lb
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto L25
            java.util.List<C> r0 = r1.mCallbacks     // Catch: java.lang.Throwable -> Lb
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lb
            int r0 = r0 + (-1)
        L1d:
            if (r0 < 0) goto L25
            r1.setRemovalBit(r0)     // Catch: java.lang.Throwable -> Lb
            int r0 = r0 + (-1)
            goto L1d
        L25:
            monitor-exit(r1)
            return
        L27:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    public synchronized androidx.databinding.CallbackRegistry<C, T, A> clone() {
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            java.lang.Object r1 = super.clone()     // Catch: java.lang.Throwable -> L32 java.lang.CloneNotSupportedException -> L3b
            androidx.databinding.CallbackRegistry r1 = (androidx.databinding.CallbackRegistry) r1     // Catch: java.lang.Throwable -> L32 java.lang.CloneNotSupportedException -> L3b
            r2 = 0
            r1.mFirst64Removed = r2     // Catch: java.lang.Throwable -> L32 java.lang.CloneNotSupportedException -> L34
            r1.mRemainderRemoved = r0     // Catch: java.lang.Throwable -> L32 java.lang.CloneNotSupportedException -> L34
            r0 = 0
            r1.mNotificationLevel = r0     // Catch: java.lang.Throwable -> L32 java.lang.CloneNotSupportedException -> L34
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L32 java.lang.CloneNotSupportedException -> L34
            r2.<init>()     // Catch: java.lang.Throwable -> L32 java.lang.CloneNotSupportedException -> L34
            r1.mCallbacks = r2     // Catch: java.lang.Throwable -> L32 java.lang.CloneNotSupportedException -> L34
            java.util.List<C> r2 = r5.mCallbacks     // Catch: java.lang.Throwable -> L32 java.lang.CloneNotSupportedException -> L34
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L32 java.lang.CloneNotSupportedException -> L34
        L1e:
            if (r0 >= r2) goto L3c
            boolean r3 = r5.isRemoved(r0)     // Catch: java.lang.Throwable -> L32 java.lang.CloneNotSupportedException -> L34
            if (r3 != 0) goto L36
            java.util.List<C> r3 = r1.mCallbacks     // Catch: java.lang.Throwable -> L32 java.lang.CloneNotSupportedException -> L34
            java.util.List<C> r4 = r5.mCallbacks     // Catch: java.lang.Throwable -> L32 java.lang.CloneNotSupportedException -> L34
            java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.Throwable -> L32 java.lang.CloneNotSupportedException -> L34
            r3.add(r4)     // Catch: java.lang.Throwable -> L32 java.lang.CloneNotSupportedException -> L34
            goto L36
        L32:
            r0 = move-exception
            goto L39
        L34:
            r0 = r1
            goto L3b
        L36:
            int r0 = r0 + 1
            goto L1e
        L39:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L32
            throw r0
        L3b:
            r1 = r0
        L3c:
            monitor-exit(r5)
            return r1
    }

    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m50clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            androidx.databinding.CallbackRegistry r0 = r1.clone()
            return r0
    }

    public synchronized java.util.ArrayList<C> copyCallbacks() {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L25
            java.util.List<C> r1 = r4.mCallbacks     // Catch: java.lang.Throwable -> L25
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L25
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L25
            java.util.List<C> r1 = r4.mCallbacks     // Catch: java.lang.Throwable -> L25
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L25
            r2 = 0
        L13:
            if (r2 >= r1) goto L2a
            boolean r3 = r4.isRemoved(r2)     // Catch: java.lang.Throwable -> L25
            if (r3 != 0) goto L27
            java.util.List<C> r3 = r4.mCallbacks     // Catch: java.lang.Throwable -> L25
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L25
            r0.add(r3)     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r0 = move-exception
            goto L2c
        L27:
            int r2 = r2 + 1
            goto L13
        L2a:
            monitor-exit(r4)
            return r0
        L2c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L25
            throw r0
    }

    public synchronized void copyCallbacks(java.util.List<C> r4) {
            r3 = this;
            monitor-enter(r3)
            r4.clear()     // Catch: java.lang.Throwable -> L1d
            java.util.List<C> r0 = r3.mCallbacks     // Catch: java.lang.Throwable -> L1d
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L1d
            r1 = 0
        Lb:
            if (r1 >= r0) goto L22
            boolean r2 = r3.isRemoved(r1)     // Catch: java.lang.Throwable -> L1d
            if (r2 != 0) goto L1f
            java.util.List<C> r2 = r3.mCallbacks     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L1d
            r4.add(r2)     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r4 = move-exception
            goto L24
        L1f:
            int r1 = r1 + 1
            goto Lb
        L22:
            monitor-exit(r3)
            return
        L24:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r4
    }

    public synchronized boolean isEmpty() {
            r5 = this;
            monitor-enter(r5)
            java.util.List<C> r0 = r5.mCallbacks     // Catch: java.lang.Throwable -> L27
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L27
            r1 = 1
            if (r0 == 0) goto Lc
            monitor-exit(r5)
            return r1
        Lc:
            int r0 = r5.mNotificationLevel     // Catch: java.lang.Throwable -> L27
            r2 = 0
            if (r0 != 0) goto L13
            monitor-exit(r5)
            return r2
        L13:
            java.util.List<C> r0 = r5.mCallbacks     // Catch: java.lang.Throwable -> L27
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L27
            r3 = 0
        L1a:
            if (r3 >= r0) goto L29
            boolean r4 = r5.isRemoved(r3)     // Catch: java.lang.Throwable -> L27
            if (r4 != 0) goto L24
            monitor-exit(r5)
            return r2
        L24:
            int r3 = r3 + 1
            goto L1a
        L27:
            r0 = move-exception
            goto L2b
        L29:
            monitor-exit(r5)
            return r1
        L2b:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L27
            throw r0
    }

    public synchronized void notifyCallbacks(T r4, int r5, A r6) {
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.mNotificationLevel     // Catch: java.lang.Throwable -> L31
            int r0 = r0 + 1
            r3.mNotificationLevel = r0     // Catch: java.lang.Throwable -> L31
            r3.notifyRecurse(r4, r5, r6)     // Catch: java.lang.Throwable -> L31
            int r4 = r3.mNotificationLevel     // Catch: java.lang.Throwable -> L31
            int r4 = r4 + (-1)
            r3.mNotificationLevel = r4     // Catch: java.lang.Throwable -> L31
            if (r4 != 0) goto L42
            long[] r4 = r3.mRemainderRemoved     // Catch: java.lang.Throwable -> L31
            r5 = 0
            if (r4 == 0) goto L36
            int r4 = r4.length     // Catch: java.lang.Throwable -> L31
            int r4 = r4 + (-1)
        L1b:
            if (r4 < 0) goto L36
            long[] r0 = r3.mRemainderRemoved     // Catch: java.lang.Throwable -> L31
            r1 = r0[r4]     // Catch: java.lang.Throwable -> L31
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L33
            int r0 = r4 + 1
            int r0 = r0 * 64
            r3.removeRemovedCallbacks(r0, r1)     // Catch: java.lang.Throwable -> L31
            long[] r0 = r3.mRemainderRemoved     // Catch: java.lang.Throwable -> L31
            r0[r4] = r5     // Catch: java.lang.Throwable -> L31
            goto L33
        L31:
            r4 = move-exception
            goto L44
        L33:
            int r4 = r4 + (-1)
            goto L1b
        L36:
            long r0 = r3.mFirst64Removed     // Catch: java.lang.Throwable -> L31
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 == 0) goto L42
            r4 = 0
            r3.removeRemovedCallbacks(r4, r0)     // Catch: java.lang.Throwable -> L31
            r3.mFirst64Removed = r5     // Catch: java.lang.Throwable -> L31
        L42:
            monitor-exit(r3)
            return
        L44:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L31
            throw r4
    }

    public synchronized void remove(C r2) {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.mNotificationLevel     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto Ld
            java.util.List<C> r0 = r1.mCallbacks     // Catch: java.lang.Throwable -> Lb
            r0.remove(r2)     // Catch: java.lang.Throwable -> Lb
            goto L18
        Lb:
            r2 = move-exception
            goto L1a
        Ld:
            java.util.List<C> r0 = r1.mCallbacks     // Catch: java.lang.Throwable -> Lb
            int r2 = r0.lastIndexOf(r2)     // Catch: java.lang.Throwable -> Lb
            if (r2 < 0) goto L18
            r1.setRemovalBit(r2)     // Catch: java.lang.Throwable -> Lb
        L18:
            monitor-exit(r1)
            return
        L1a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }
}
