package okhttp3.internal.connection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface RoutePlanner {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class ConnectResult {

        @org.jetbrains.annotations.Nullable
        private final okhttp3.internal.connection.RoutePlanner.Plan nextPlan;

        @org.jetbrains.annotations.NotNull
        private final okhttp3.internal.connection.RoutePlanner.Plan plan;

        @org.jetbrains.annotations.Nullable
        private final java.lang.Throwable throwable;

        public ConnectResult(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RoutePlanner.Plan r2, @org.jetbrains.annotations.Nullable okhttp3.internal.connection.RoutePlanner.Plan r3, @org.jetbrains.annotations.Nullable java.lang.Throwable r4) {
                r1 = this;
                java.lang.String r0 = "plan"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.plan = r2
                r1.nextPlan = r3
                r1.throwable = r4
                return
        }

        public /* synthetic */ ConnectResult(okhttp3.internal.connection.RoutePlanner.Plan r2, okhttp3.internal.connection.RoutePlanner.Plan r3, java.lang.Throwable r4, int r5, kotlin.jvm.internal.v r6) {
                r1 = this;
                r6 = r5 & 2
                r0 = 0
                if (r6 == 0) goto L6
                r3 = r0
            L6:
                r5 = r5 & 4
                if (r5 == 0) goto Lb
                r4 = r0
            Lb:
                r1.<init>(r2, r3, r4)
                return
        }

        public static /* synthetic */ okhttp3.internal.connection.RoutePlanner.ConnectResult copy$default(okhttp3.internal.connection.RoutePlanner.ConnectResult r0, okhttp3.internal.connection.RoutePlanner.Plan r1, okhttp3.internal.connection.RoutePlanner.Plan r2, java.lang.Throwable r3, int r4, java.lang.Object r5) {
                r5 = r4 & 1
                if (r5 == 0) goto L6
                okhttp3.internal.connection.RoutePlanner$Plan r1 = r0.plan
            L6:
                r5 = r4 & 2
                if (r5 == 0) goto Lc
                okhttp3.internal.connection.RoutePlanner$Plan r2 = r0.nextPlan
            Lc:
                r4 = r4 & 4
                if (r4 == 0) goto L12
                java.lang.Throwable r3 = r0.throwable
            L12:
                okhttp3.internal.connection.RoutePlanner$ConnectResult r0 = r0.copy(r1, r2, r3)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.connection.RoutePlanner.Plan component1() {
                r1 = this;
                okhttp3.internal.connection.RoutePlanner$Plan r0 = r1.plan
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.internal.connection.RoutePlanner.Plan component2() {
                r1 = this;
                okhttp3.internal.connection.RoutePlanner$Plan r0 = r1.nextPlan
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Throwable component3() {
                r1 = this;
                java.lang.Throwable r0 = r1.throwable
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.connection.RoutePlanner.ConnectResult copy(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RoutePlanner.Plan r2, @org.jetbrains.annotations.Nullable okhttp3.internal.connection.RoutePlanner.Plan r3, @org.jetbrains.annotations.Nullable java.lang.Throwable r4) {
                r1 = this;
                java.lang.String r0 = "plan"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.internal.connection.RoutePlanner$ConnectResult r0 = new okhttp3.internal.connection.RoutePlanner$ConnectResult
                r0.<init>(r2, r3, r4)
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof okhttp3.internal.connection.RoutePlanner.ConnectResult
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                okhttp3.internal.connection.RoutePlanner$ConnectResult r5 = (okhttp3.internal.connection.RoutePlanner.ConnectResult) r5
                okhttp3.internal.connection.RoutePlanner$Plan r1 = r4.plan
                okhttp3.internal.connection.RoutePlanner$Plan r3 = r5.plan
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                okhttp3.internal.connection.RoutePlanner$Plan r1 = r4.nextPlan
                okhttp3.internal.connection.RoutePlanner$Plan r3 = r5.nextPlan
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                java.lang.Throwable r1 = r4.throwable
                java.lang.Throwable r5 = r5.throwable
                boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
                if (r5 != 0) goto L2d
                return r2
            L2d:
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.internal.connection.RoutePlanner.Plan getNextPlan() {
                r1 = this;
                okhttp3.internal.connection.RoutePlanner$Plan r0 = r1.nextPlan
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.connection.RoutePlanner.Plan getPlan() {
                r1 = this;
                okhttp3.internal.connection.RoutePlanner$Plan r0 = r1.plan
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Throwable getThrowable() {
                r1 = this;
                java.lang.Throwable r0 = r1.throwable
                return r0
        }

        public int hashCode() {
                r3 = this;
                okhttp3.internal.connection.RoutePlanner$Plan r0 = r3.plan
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                okhttp3.internal.connection.RoutePlanner$Plan r1 = r3.nextPlan
                r2 = 0
                if (r1 != 0) goto Lf
                r1 = 0
                goto L13
            Lf:
                int r1 = r1.hashCode()
            L13:
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.Throwable r1 = r3.throwable
                if (r1 != 0) goto L1b
                goto L1f
            L1b:
                int r2 = r1.hashCode()
            L1f:
                int r0 = r0 + r2
                return r0
        }

        public final boolean isSuccess() {
                r1 = this;
                okhttp3.internal.connection.RoutePlanner$Plan r0 = r1.nextPlan
                if (r0 != 0) goto La
                java.lang.Throwable r0 = r1.throwable
                if (r0 != 0) goto La
                r0 = 1
                return r0
            La:
                r0 = 0
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ConnectResult(plan="
                r0.append(r1)
                okhttp3.internal.connection.RoutePlanner$Plan r1 = r2.plan
                r0.append(r1)
                java.lang.String r1 = ", nextPlan="
                r0.append(r1)
                okhttp3.internal.connection.RoutePlanner$Plan r1 = r2.nextPlan
                r0.append(r1)
                java.lang.String r1 = ", throwable="
                r0.append(r1)
                java.lang.Throwable r1 = r2.throwable
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class DefaultImpls {
        public DefaultImpls() {
                r1 = this;
                r1.<init>()
                return
        }

        public static /* synthetic */ boolean hasNext$default(okhttp3.internal.connection.RoutePlanner r0, okhttp3.internal.connection.RealConnection r1, int r2, java.lang.Object r3) {
                boolean r0 = okhttp3.internal.connection.c.a(r0, r1, r2, r3)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Plan {
        /* renamed from: cancel */
        void mo5cancel();

        @org.jetbrains.annotations.NotNull
        /* renamed from: connectTcp */
        okhttp3.internal.connection.RoutePlanner.ConnectResult mo13connectTcp();

        @org.jetbrains.annotations.NotNull
        /* renamed from: connectTlsEtc */
        okhttp3.internal.connection.RoutePlanner.ConnectResult mo14connectTlsEtc();

        @org.jetbrains.annotations.NotNull
        /* renamed from: handleSuccess */
        okhttp3.internal.connection.RealConnection mo6handleSuccess();

        boolean isReady();

        @org.jetbrains.annotations.Nullable
        /* renamed from: retry */
        okhttp3.internal.connection.RoutePlanner.Plan mo7retry();
    }

    @org.jetbrains.annotations.NotNull
    okhttp3.Address getAddress();

    @org.jetbrains.annotations.NotNull
    kotlin.collections.m<okhttp3.internal.connection.RoutePlanner.Plan> getDeferredPlans();

    boolean hasNext(@org.jetbrains.annotations.Nullable okhttp3.internal.connection.RealConnection r1);

    boolean isCanceled();

    @org.jetbrains.annotations.NotNull
    okhttp3.internal.connection.RoutePlanner.Plan plan() throws java.io.IOException;

    boolean sameHostAndPort(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r1);
}
