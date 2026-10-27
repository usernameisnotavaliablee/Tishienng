package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ConnectionPool {

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.RealConnectionPool delegate;

    public ConnectionPool() {
            r4 = this;
            r0 = 5
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            r3 = 5
            r4.<init>(r3, r0, r2)
            return
    }

    public ConnectionPool(int r9, long r10, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r12) {
            r8 = this;
            java.lang.String r0 = "timeUnit"
            kotlin.jvm.internal.g0.p(r12, r0)
            okhttp3.internal.concurrent.TaskRunner r6 = okhttp3.internal.concurrent.TaskRunner.INSTANCE
            okhttp3.internal.connection.ConnectionListener$Companion r0 = okhttp3.internal.connection.ConnectionListener.Companion
            okhttp3.internal.connection.ConnectionListener r7 = r0.getNONE()
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            r1.<init>(r2, r3, r5, r6, r7)
            return
    }

    public ConnectionPool(int r9, long r10, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r12, @org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r13, @org.jetbrains.annotations.NotNull okhttp3.internal.connection.ConnectionListener r14) {
            r8 = this;
            java.lang.String r0 = "timeUnit"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "taskRunner"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "connectionListener"
            kotlin.jvm.internal.g0.p(r14, r0)
            okhttp3.internal.connection.RealConnectionPool r1 = new okhttp3.internal.connection.RealConnectionPool
            r3 = r9
            r4 = r10
            r6 = r12
            r2 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r6, r7)
            r8.<init>(r1)
            return
    }

    public /* synthetic */ ConnectionPool(int r1, long r2, java.util.concurrent.TimeUnit r4, okhttp3.internal.concurrent.TaskRunner r5, okhttp3.internal.connection.ConnectionListener r6, int r7, kotlin.jvm.internal.v r8) {
            r0 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L5
            r1 = 5
        L5:
            r8 = r7 & 2
            if (r8 == 0) goto Lb
            r2 = 5
        Lb:
            r8 = r7 & 4
            if (r8 == 0) goto L11
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MINUTES
        L11:
            r8 = r7 & 8
            if (r8 == 0) goto L17
            okhttp3.internal.concurrent.TaskRunner r5 = okhttp3.internal.concurrent.TaskRunner.INSTANCE
        L17:
            r7 = r7 & 16
            if (r7 == 0) goto L21
            okhttp3.internal.connection.ConnectionListener$Companion r6 = okhttp3.internal.connection.ConnectionListener.Companion
            okhttp3.internal.connection.ConnectionListener r6 = r6.getNONE()
        L21:
            r7 = r5
            r8 = r6
            r6 = r4
            r4 = r2
            r2 = r0
            r3 = r1
            r2.<init>(r3, r4, r6, r7, r8)
            return
    }

    public ConnectionPool(int r9, long r10, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r12, @org.jetbrains.annotations.NotNull okhttp3.internal.connection.ConnectionListener r13) {
            r8 = this;
            java.lang.String r0 = "timeUnit"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "connectionListener"
            kotlin.jvm.internal.g0.p(r13, r0)
            okhttp3.internal.concurrent.TaskRunner r6 = okhttp3.internal.concurrent.TaskRunner.INSTANCE
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            r7 = r13
            r1.<init>(r2, r3, r5, r6, r7)
            return
    }

    public /* synthetic */ ConnectionPool(int r1, long r2, java.util.concurrent.TimeUnit r4, okhttp3.internal.connection.ConnectionListener r5, int r6, kotlin.jvm.internal.v r7) {
            r0 = this;
            r7 = r6 & 1
            if (r7 == 0) goto L5
            r1 = 5
        L5:
            r7 = r6 & 2
            if (r7 == 0) goto Lb
            r2 = 5
        Lb:
            r7 = r6 & 4
            if (r7 == 0) goto L11
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MINUTES
        L11:
            r6 = r6 & 8
            if (r6 == 0) goto L1b
            okhttp3.internal.connection.ConnectionListener$Companion r5 = okhttp3.internal.connection.ConnectionListener.Companion
            okhttp3.internal.connection.ConnectionListener r5 = r5.getNONE()
        L1b:
            r6 = r4
            r7 = r5
            r4 = r2
            r2 = r0
            r3 = r1
            r2.<init>(r3, r4, r6, r7)
            return
    }

    public ConnectionPool(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealConnectionPool r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.delegate = r2
            return
    }

    public final int connectionCount() {
            r1 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r1.delegate
            int r0 = r0.connectionCount()
            return r0
    }

    public final void evictAll() {
            r1 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r1.delegate
            r0.evictAll()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.connection.ConnectionListener getConnectionListener$okhttp() {
            r1 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r1.delegate
            okhttp3.internal.connection.ConnectionListener r0 = r0.getConnectionListener$okhttp()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.connection.RealConnectionPool getDelegate$okhttp() {
            r1 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r1.delegate
            return r0
    }

    public final int idleConnectionCount() {
            r1 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r1.delegate
            int r0 = r0.idleConnectionCount()
            return r0
    }
}
