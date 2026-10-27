package okhttp3.internal.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nHttp2Connection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n+ 2 Lockable.kt\nokhttp3/internal/concurrent/LockableKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 -UtilCommon.kt\nokhttp3/internal/_UtilCommonKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1042:1\n63#2:1043\n63#2:1044\n63#2:1045\n38#2:1046\n63#2:1047\n63#2:1049\n63#2:1050\n63#2:1051\n34#2:1052\n63#2:1053\n63#2:1054\n34#2:1055\n63#2:1056\n63#2:1057\n49#2,4:1058\n63#2:1067\n63#2:1087\n63#2:1088\n63#2:1089\n63#2:1090\n63#2:1091\n63#2:1092\n63#2:1095\n63#2:1101\n63#2:1107\n63#2:1111\n1#3:1048\n228#4,5:1062\n228#4,5:1071\n228#4,5:1077\n228#4,5:1082\n228#4,2:1093\n230#4,3:1096\n228#4,2:1099\n230#4,3:1102\n228#4,2:1105\n230#4,3:1108\n37#5,2:1068\n13805#6:1070\n13806#6:1076\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n174#1:1043\n176#1:1044\n179#1:1045\n183#1:1046\n190#1:1047\n242#1:1049\n243#1:1050\n313#1:1051\n321#1:1052\n394#1:1053\n405#1:1054\n407#1:1055\n424#1:1056\n426#1:1057\n452#1:1058,4\n459#1:1067\n519#1:1087\n520#1:1088\n531#1:1089\n557#1:1090\n914#1:1091\n152#1:1092\n926#1:1095\n944#1:1101\n971#1:1107\n985#1:1111\n454#1:1062,5\n467#1:1071,5\n473#1:1077,5\n478#1:1082,5\n923#1:1093,2\n923#1:1096,3\n941#1:1099,2\n941#1:1102,3\n967#1:1105,2\n967#1:1108,3\n461#1:1068,2\n466#1:1070\n466#1:1076\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class Http2Connection implements java.io.Closeable, okhttp3.internal.concurrent.Lockable {
    public static final int AWAIT_PING = 3;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http2.Http2Connection.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final okhttp3.internal.http2.Settings DEFAULT_SETTINGS = null;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String connectionName;

    @org.jetbrains.annotations.NotNull
    private final java.util.Set<java.lang.Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http2.FlowControlListener flowControlListener;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http2.Http2Connection.Listener listener;
    private int nextStreamId;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http2.Settings okHttpSettings;

    @org.jetbrains.annotations.NotNull
    private okhttp3.internal.http2.Settings peerSettings;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http2.PushObserver pushObserver;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.concurrent.TaskQueue pushQueue;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http2.flowcontrol.WindowCounter readBytes;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http2.Http2Connection.ReaderRunnable readerRunnable;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.concurrent.TaskQueue settingsListenerQueue;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.BufferedSocket socket;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> streams;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.concurrent.TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http2.Http2Writer writer;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.concurrent.TaskQueue writerQueue;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {
        private boolean client;
        public java.lang.String connectionName;

        @org.jetbrains.annotations.NotNull
        private okhttp3.internal.http2.FlowControlListener flowControlListener;

        @org.jetbrains.annotations.NotNull
        private okhttp3.internal.http2.Http2Connection.Listener listener;
        private int pingIntervalMillis;

        @org.jetbrains.annotations.NotNull
        private okhttp3.internal.http2.PushObserver pushObserver;
        public okhttp3.internal.connection.BufferedSocket socket;

        @org.jetbrains.annotations.NotNull
        private final okhttp3.internal.concurrent.TaskRunner taskRunner;

        public Builder(boolean r2, @org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r3) {
                r1 = this;
                java.lang.String r0 = "taskRunner"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.<init>()
                r1.client = r2
                r1.taskRunner = r3
                okhttp3.internal.http2.Http2Connection$Listener r2 = okhttp3.internal.http2.Http2Connection.Listener.REFUSE_INCOMING_STREAMS
                r1.listener = r2
                okhttp3.internal.http2.PushObserver r2 = okhttp3.internal.http2.PushObserver.CANCEL
                r1.pushObserver = r2
                okhttp3.internal.http2.FlowControlListener$None r2 = okhttp3.internal.http2.FlowControlListener.None.INSTANCE
                r1.flowControlListener = r2
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.http2.Http2Connection build() {
                r1 = this;
                okhttp3.internal.http2.Http2Connection r0 = new okhttp3.internal.http2.Http2Connection
                r0.<init>(r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.http2.Http2Connection.Builder flowControlListener(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.FlowControlListener r2) {
                r1 = this;
                java.lang.String r0 = "flowControlListener"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.flowControlListener = r2
                return r1
        }

        public final boolean getClient$okhttp() {
                r1 = this;
                boolean r0 = r1.client
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getConnectionName$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.connectionName
                if (r0 == 0) goto L5
                return r0
            L5:
                java.lang.String r0 = "connectionName"
                kotlin.jvm.internal.g0.S(r0)
                r0 = 0
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.http2.FlowControlListener getFlowControlListener$okhttp() {
                r1 = this;
                okhttp3.internal.http2.FlowControlListener r0 = r1.flowControlListener
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.http2.Http2Connection.Listener getListener$okhttp() {
                r1 = this;
                okhttp3.internal.http2.Http2Connection$Listener r0 = r1.listener
                return r0
        }

        public final int getPingIntervalMillis$okhttp() {
                r1 = this;
                int r0 = r1.pingIntervalMillis
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.http2.PushObserver getPushObserver$okhttp() {
                r1 = this;
                okhttp3.internal.http2.PushObserver r0 = r1.pushObserver
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.connection.BufferedSocket getSocket$okhttp() {
                r1 = this;
                okhttp3.internal.connection.BufferedSocket r0 = r1.socket
                if (r0 == 0) goto L5
                return r0
            L5:
                java.lang.String r0 = "socket"
                kotlin.jvm.internal.g0.S(r0)
                r0 = 0
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.concurrent.TaskRunner getTaskRunner$okhttp() {
                r1 = this;
                okhttp3.internal.concurrent.TaskRunner r0 = r1.taskRunner
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.http2.Http2Connection.Builder listener(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.Http2Connection.Listener r2) {
                r1 = this;
                java.lang.String r0 = "listener"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.listener = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.http2.Http2Connection.Builder pingIntervalMillis(int r1) {
                r0 = this;
                r0.pingIntervalMillis = r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.http2.Http2Connection.Builder pushObserver(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.PushObserver r2) {
                r1 = this;
                java.lang.String r0 = "pushObserver"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.pushObserver = r2
                return r1
        }

        public final void setClient$okhttp(boolean r1) {
                r0 = this;
                r0.client = r1
                return
        }

        public final void setConnectionName$okhttp(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.connectionName = r2
                return
        }

        public final void setFlowControlListener$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.FlowControlListener r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.flowControlListener = r2
                return
        }

        public final void setListener$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.Http2Connection.Listener r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.listener = r2
                return
        }

        public final void setPingIntervalMillis$okhttp(int r1) {
                r0 = this;
                r0.pingIntervalMillis = r1
                return
        }

        public final void setPushObserver$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.PushObserver r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.pushObserver = r2
                return
        }

        public final void setSocket$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.BufferedSocket r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.socket = r2
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.http2.Http2Connection.Builder socket(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.BufferedSocket r2, @org.jetbrains.annotations.NotNull java.lang.String r3) throws java.io.IOException {
                r1 = this;
                java.lang.String r0 = "socket"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "peerName"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.setSocket$okhttp(r2)
                boolean r2 = r1.client
                if (r2 == 0) goto L28
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r0 = okhttp3.internal._UtilJvmKt.okHttpName
                r2.append(r0)
                r0 = 32
                r2.append(r0)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                goto L39
            L28:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r0 = "MockWebServer "
                r2.append(r0)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
            L39:
                r1.setConnectionName$okhttp(r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.http2.Settings getDEFAULT_SETTINGS() {
                r1 = this;
                okhttp3.internal.http2.Settings r0 = okhttp3.internal.http2.Http2Connection.access$getDEFAULT_SETTINGS$cp()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Listener {

        @org.jetbrains.annotations.NotNull
        public static final okhttp3.internal.http2.Http2Connection.Listener.Companion Companion = null;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public static final okhttp3.internal.http2.Http2Connection.Listener REFUSE_INCOMING_STREAMS = null;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class Companion {
            private Companion() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        static {
                okhttp3.internal.http2.Http2Connection$Listener$Companion r0 = new okhttp3.internal.http2.Http2Connection$Listener$Companion
                r1 = 0
                r0.<init>(r1)
                okhttp3.internal.http2.Http2Connection.Listener.Companion = r0
                okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1 r0 = new okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
                r0.<init>()
                okhttp3.internal.http2.Http2Connection.Listener.REFUSE_INCOMING_STREAMS = r0
                return
        }

        public Listener() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onSettings(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.Http2Connection r2, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.Settings r3) {
                r1 = this;
                java.lang.String r0 = "connection"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "settings"
                kotlin.jvm.internal.g0.p(r3, r2)
                return
        }

        public abstract void onStream(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.Http2Stream r1) throws java.io.IOException;
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nHttp2Connection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n+ 2 Lockable.kt\nokhttp3/internal/concurrent/LockableKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 -UtilCommon.kt\nokhttp3/internal/_UtilCommonKt\n*L\n1#1,1042:1\n63#2:1043\n63#2:1044\n63#2:1045\n63#2:1048\n63#2:1049\n38#2:1050\n63#2:1051\n63#2:1054\n38#2:1055\n63#2:1056\n37#3,2:1046\n37#3,2:1052\n228#4,5:1057\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n678#1:1043\n757#1:1044\n758#1:1045\n792#1:1048\n809#1:1049\n819#1:1050\n845#1:1051\n864#1:1054\n866#1:1055\n871#1:1056\n775#1:1046,2\n846#1:1052,2\n703#1:1057,5\n*E\n"})
    public final class ReaderRunnable implements okhttp3.internal.http2.Http2Reader.Handler, kotlin.jvm.functions.Function0<kotlin.n1> {

        @org.jetbrains.annotations.NotNull
        private final okhttp3.internal.http2.Http2Reader reader;
        final /* synthetic */ okhttp3.internal.http2.Http2Connection this$0;

        public ReaderRunnable(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.Http2Connection r2, okhttp3.internal.http2.Http2Reader r3) {
                r1 = this;
                java.lang.String r0 = "reader"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.this$0 = r2
                r1.<init>()
                r1.reader = r3
                return
        }

        public static /* synthetic */ kotlin.n1 a(okhttp3.internal.http2.Http2Connection r0, kotlin.jvm.internal.Ref.ObjectRef r1) {
                kotlin.n1 r0 = applyAndAckSettings$lambda$0$0$1(r0, r1)
                return r0
        }

        private static final kotlin.n1 applyAndAckSettings$lambda$0$0$1(okhttp3.internal.http2.Http2Connection r1, kotlin.jvm.internal.Ref.ObjectRef r2) {
                okhttp3.internal.http2.Http2Connection$Listener r0 = r1.getListener$okhttp()
                java.lang.Object r2 = r2.element
                okhttp3.internal.http2.Settings r2 = (okhttp3.internal.http2.Settings) r2
                r0.onSettings(r1, r2)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        public static /* synthetic */ kotlin.n1 b(okhttp3.internal.http2.Http2Connection r0, int r1, int r2) {
                kotlin.n1 r0 = ping$lambda$1(r0, r1, r2)
                return r0
        }

        public static /* synthetic */ kotlin.n1 c(okhttp3.internal.http2.Http2Connection r0, okhttp3.internal.http2.Http2Stream r1) {
                kotlin.n1 r0 = headers$lambda$0$0(r0, r1)
                return r0
        }

        public static /* synthetic */ kotlin.n1 d(okhttp3.internal.http2.Http2Connection.ReaderRunnable r0, boolean r1, okhttp3.internal.http2.Settings r2) {
                kotlin.n1 r0 = settings$lambda$0(r0, r1, r2)
                return r0
        }

        private static final kotlin.n1 headers$lambda$0$0(okhttp3.internal.http2.Http2Connection r4, okhttp3.internal.http2.Http2Stream r5) {
                okhttp3.internal.http2.Http2Connection$Listener r0 = r4.getListener$okhttp()     // Catch: java.io.IOException -> L8
                r0.onStream(r5)     // Catch: java.io.IOException -> L8
                goto L2d
            L8:
                r0 = move-exception
                okhttp3.internal.platform.Platform$Companion r1 = okhttp3.internal.platform.Platform.Companion
                okhttp3.internal.platform.Platform r1 = r1.get()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Http2Connection.Listener failure for "
                r2.append(r3)
                java.lang.String r4 = r4.getConnectionName$okhttp()
                r2.append(r4)
                java.lang.String r4 = r2.toString()
                r2 = 4
                r1.log(r4, r2, r0)
                okhttp3.internal.http2.ErrorCode r4 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch: java.io.IOException -> L2d
                r5.close(r4, r0)     // Catch: java.io.IOException -> L2d
            L2d:
                kotlin.n1 r4 = kotlin.n1.a
                return r4
        }

        private static final kotlin.n1 ping$lambda$1(okhttp3.internal.http2.Http2Connection r1, int r2, int r3) {
                r0 = 1
                r1.writePing(r0, r2, r3)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        private static final kotlin.n1 settings$lambda$0(okhttp3.internal.http2.Http2Connection.ReaderRunnable r0, boolean r1, okhttp3.internal.http2.Settings r2) {
                r0.applyAndAckSettings(r1, r2)
                kotlin.n1 r0 = kotlin.n1.a
                return r0
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
                r0 = this;
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull okio.ByteString r3, @org.jetbrains.annotations.NotNull java.lang.String r4, int r5, long r6) {
                r0 = this;
                java.lang.String r1 = "origin"
                kotlin.jvm.internal.g0.p(r2, r1)
                java.lang.String r1 = "protocol"
                kotlin.jvm.internal.g0.p(r3, r1)
                java.lang.String r1 = "host"
                kotlin.jvm.internal.g0.p(r4, r1)
                return
        }

        public final void applyAndAckSettings(boolean r18, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.Settings r19) {
                r17 = this;
                r1 = r17
                r0 = r19
                java.lang.String r2 = "settings"
                kotlin.jvm.internal.g0.p(r0, r2)
                kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
                r2.<init>()
                okhttp3.internal.http2.Http2Connection r3 = r1.this$0
                okhttp3.internal.http2.Http2Writer r3 = r3.getWriter()
                okhttp3.internal.http2.Http2Connection r4 = r1.this$0
                monitor-enter(r3)
                monitor-enter(r4)     // Catch: java.lang.Throwable -> L9d
                okhttp3.internal.http2.Settings r5 = r4.getPeerSettings()     // Catch: java.lang.Throwable -> L5c
                if (r18 == 0) goto L1f
                goto L2b
            L1f:
                okhttp3.internal.http2.Settings r6 = new okhttp3.internal.http2.Settings     // Catch: java.lang.Throwable -> L5c
                r6.<init>()     // Catch: java.lang.Throwable -> L5c
                r6.merge(r5)     // Catch: java.lang.Throwable -> L5c
                r6.merge(r0)     // Catch: java.lang.Throwable -> L5c
                r0 = r6
            L2b:
                r2.element = r0     // Catch: java.lang.Throwable -> L5c
                int r0 = r0.getInitialWindowSize()     // Catch: java.lang.Throwable -> L5c
                long r6 = (long) r0     // Catch: java.lang.Throwable -> L5c
                int r0 = r5.getInitialWindowSize()     // Catch: java.lang.Throwable -> L5c
                long r8 = (long) r0     // Catch: java.lang.Throwable -> L5c
                long r6 = r6 - r8
                r8 = 0
                r5 = 0
                int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r0 == 0) goto L5e
                java.util.Map r0 = r4.getStreams$okhttp()     // Catch: java.lang.Throwable -> L5c
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L5c
                if (r0 == 0) goto L4a
                goto L5e
            L4a:
                java.util.Map r0 = r4.getStreams$okhttp()     // Catch: java.lang.Throwable -> L5c
                java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L5c
                okhttp3.internal.http2.Http2Stream[] r8 = new okhttp3.internal.http2.Http2Stream[r5]     // Catch: java.lang.Throwable -> L5c
                java.lang.Object[] r0 = r0.toArray(r8)     // Catch: java.lang.Throwable -> L5c
                okhttp3.internal.http2.Http2Stream[] r0 = (okhttp3.internal.http2.Http2Stream[]) r0     // Catch: java.lang.Throwable -> L5c
            L5a:
                r8 = r0
                goto L60
            L5c:
                r0 = move-exception
                goto Lbb
            L5e:
                r0 = 0
                goto L5a
            L60:
                java.lang.Object r0 = r2.element     // Catch: java.lang.Throwable -> L5c
                okhttp3.internal.http2.Settings r0 = (okhttp3.internal.http2.Settings) r0     // Catch: java.lang.Throwable -> L5c
                r4.setPeerSettings(r0)     // Catch: java.lang.Throwable -> L5c
                okhttp3.internal.concurrent.TaskQueue r9 = okhttp3.internal.http2.Http2Connection.access$getSettingsListenerQueue$p(r4)     // Catch: java.lang.Throwable -> L5c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
                r0.<init>()     // Catch: java.lang.Throwable -> L5c
                java.lang.String r10 = r4.getConnectionName$okhttp()     // Catch: java.lang.Throwable -> L5c
                r0.append(r10)     // Catch: java.lang.Throwable -> L5c
                java.lang.String r10 = " onSettings"
                r0.append(r10)     // Catch: java.lang.Throwable -> L5c
                java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L5c
                okhttp3.internal.http2.l r14 = new okhttp3.internal.http2.l     // Catch: java.lang.Throwable -> L5c
                r14.<init>(r4, r2)     // Catch: java.lang.Throwable -> L5c
                r15 = 6
                r16 = 0
                r11 = 0
                r13 = 0
                okhttp3.internal.concurrent.TaskQueue.execute$default(r9, r10, r11, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L5c
                kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L5c
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L9d
                okhttp3.internal.http2.Http2Writer r0 = r4.getWriter()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
                java.lang.Object r2 = r2.element     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
                okhttp3.internal.http2.Settings r2 = (okhttp3.internal.http2.Settings) r2     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
                r0.applyAndAckSettings(r2)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
                goto La3
            L9d:
                r0 = move-exception
                goto Lbd
            L9f:
                r0 = move-exception
                okhttp3.internal.http2.Http2Connection.access$failConnection(r4, r0)     // Catch: java.lang.Throwable -> L9d
            La3:
                kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L9d
                monitor-exit(r3)
                if (r8 == 0) goto Lba
                int r0 = r8.length
            La9:
                if (r5 >= r0) goto Lba
                r2 = r8[r5]
                monitor-enter(r2)
                r2.addBytesToWriteWindow(r6)     // Catch: java.lang.Throwable -> Lb7
                kotlin.n1 r3 = kotlin.n1.a     // Catch: java.lang.Throwable -> Lb7
                monitor-exit(r2)
                int r5 = r5 + 1
                goto La9
            Lb7:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            Lba:
                return
            Lbb:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L9d
                throw r0     // Catch: java.lang.Throwable -> L9d
            Lbd:
                monitor-exit(r3)
                throw r0
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean r3, int r4, @org.jetbrains.annotations.NotNull okio.BufferedSource r5, int r6) throws java.io.IOException {
                r2 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.g0.p(r5, r0)
                okhttp3.internal.http2.Http2Connection r0 = r2.this$0
                boolean r0 = r0.pushedStream$okhttp(r4)
                if (r0 == 0) goto L13
                okhttp3.internal.http2.Http2Connection r0 = r2.this$0
                r0.pushDataLater$okhttp(r4, r5, r6, r3)
                return
            L13:
                okhttp3.internal.http2.Http2Connection r0 = r2.this$0
                okhttp3.internal.http2.Http2Stream r0 = r0.getStream(r4)
                if (r0 != 0) goto L2c
                okhttp3.internal.http2.Http2Connection r3 = r2.this$0
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR
                r3.writeSynResetLater$okhttp(r4, r0)
                okhttp3.internal.http2.Http2Connection r3 = r2.this$0
                long r0 = (long) r6
                r3.updateConnectionFlowControl$okhttp(r0)
                r5.skip(r0)
                return
            L2c:
                r0.receiveData(r5, r6)
                if (r3 == 0) goto L37
                okhttp3.Headers r3 = okhttp3.Headers.EMPTY
                r4 = 1
                r0.receiveHeaders(r3, r4)
            L37:
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.http2.Http2Reader getReader$okhttp() {
                r1 = this;
                okhttp3.internal.http2.Http2Reader r0 = r1.reader
                return r0
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int r4, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r5, @org.jetbrains.annotations.NotNull okio.ByteString r6) {
                r3 = this;
                java.lang.String r0 = "errorCode"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r5 = "debugData"
                kotlin.jvm.internal.g0.p(r6, r5)
                r6.size()
                okhttp3.internal.http2.Http2Connection r5 = r3.this$0
                monitor-enter(r5)
                java.util.Map r6 = r5.getStreams$okhttp()     // Catch: java.lang.Throwable -> L4b
                java.util.Collection r6 = r6.values()     // Catch: java.lang.Throwable -> L4b
                r0 = 0
                okhttp3.internal.http2.Http2Stream[] r1 = new okhttp3.internal.http2.Http2Stream[r0]     // Catch: java.lang.Throwable -> L4b
                java.lang.Object[] r6 = r6.toArray(r1)     // Catch: java.lang.Throwable -> L4b
                r1 = 1
                okhttp3.internal.http2.Http2Connection.access$setShutdown$p(r5, r1)     // Catch: java.lang.Throwable -> L4b
                kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L4b
                monitor-exit(r5)
                okhttp3.internal.http2.Http2Stream[] r6 = (okhttp3.internal.http2.Http2Stream[]) r6
                int r5 = r6.length
            L29:
                if (r0 >= r5) goto L4a
                r1 = r6[r0]
                int r2 = r1.getId()
                if (r2 <= r4) goto L47
                boolean r2 = r1.isLocallyInitiated()
                if (r2 == 0) goto L47
                okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM
                r1.receiveRstStream(r2)
                okhttp3.internal.http2.Http2Connection r2 = r3.this$0
                int r1 = r1.getId()
                r2.removeStream$okhttp(r1)
            L47:
                int r0 = r0 + 1
                goto L29
            L4a:
                return
            L4b:
                r4 = move-exception
                monitor-exit(r5)
                throw r4
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void headers(boolean r12, int r13, int r14, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r15) {
                r11 = this;
                java.lang.String r14 = "headerBlock"
                kotlin.jvm.internal.g0.p(r15, r14)
                okhttp3.internal.http2.Http2Connection r14 = r11.this$0
                boolean r14 = r14.pushedStream$okhttp(r13)
                if (r14 == 0) goto L13
                okhttp3.internal.http2.Http2Connection r14 = r11.this$0
                r14.pushHeadersLater$okhttp(r13, r15, r12)
                return
            L13:
                okhttp3.internal.http2.Http2Connection r2 = r11.this$0
                monitor-enter(r2)
                okhttp3.internal.http2.Http2Stream r14 = r2.getStream(r13)     // Catch: java.lang.Throwable -> L86
                if (r14 != 0) goto L89
                boolean r14 = okhttp3.internal.http2.Http2Connection.access$isShutdown$p(r2)     // Catch: java.lang.Throwable -> L86
                if (r14 == 0) goto L24
                monitor-exit(r2)
                return
            L24:
                int r14 = r2.getLastGoodStreamId$okhttp()     // Catch: java.lang.Throwable -> L86
                if (r13 > r14) goto L2c
                monitor-exit(r2)
                return
            L2c:
                int r14 = r13 % 2
                int r0 = r2.getNextStreamId$okhttp()     // Catch: java.lang.Throwable -> L86
                int r0 = r0 % 2
                if (r14 != r0) goto L38
                monitor-exit(r2)
                return
            L38:
                okhttp3.Headers r5 = okhttp3.internal._UtilJvmKt.toHeaders(r15)     // Catch: java.lang.Throwable -> L86
                okhttp3.internal.http2.Http2Stream r0 = new okhttp3.internal.http2.Http2Stream     // Catch: java.lang.Throwable -> L86
                r3 = 0
                r4 = r12
                r1 = r13
                r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L86
                r2.setLastGoodStreamId$okhttp(r1)     // Catch: java.lang.Throwable -> L86
                java.util.Map r12 = r2.getStreams$okhttp()     // Catch: java.lang.Throwable -> L86
                java.lang.Integer r13 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L86
                r12.put(r13, r0)     // Catch: java.lang.Throwable -> L86
                okhttp3.internal.concurrent.TaskRunner r12 = okhttp3.internal.http2.Http2Connection.access$getTaskRunner$p(r2)     // Catch: java.lang.Throwable -> L86
                okhttp3.internal.concurrent.TaskQueue r3 = r12.newQueue()     // Catch: java.lang.Throwable -> L86
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
                r12.<init>()     // Catch: java.lang.Throwable -> L86
                java.lang.String r13 = r2.getConnectionName$okhttp()     // Catch: java.lang.Throwable -> L86
                r12.append(r13)     // Catch: java.lang.Throwable -> L86
                r13 = 91
                r12.append(r13)     // Catch: java.lang.Throwable -> L86
                r12.append(r1)     // Catch: java.lang.Throwable -> L86
                java.lang.String r13 = "] onStream"
                r12.append(r13)     // Catch: java.lang.Throwable -> L86
                java.lang.String r4 = r12.toString()     // Catch: java.lang.Throwable -> L86
                okhttp3.internal.http2.j r8 = new okhttp3.internal.http2.j     // Catch: java.lang.Throwable -> L86
                r8.<init>(r2, r0)     // Catch: java.lang.Throwable -> L86
                r9 = 6
                r10 = 0
                r5 = 0
                r7 = 0
                okhttp3.internal.concurrent.TaskQueue.execute$default(r3, r4, r5, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L86
                monitor-exit(r2)
                return
            L86:
                r0 = move-exception
                r12 = r0
                goto L95
            L89:
                r4 = r12
                kotlin.n1 r12 = kotlin.n1.a     // Catch: java.lang.Throwable -> L86
                monitor-exit(r2)
                okhttp3.Headers r12 = okhttp3.internal._UtilJvmKt.toHeaders(r15)
                r14.receiveHeaders(r12, r4)
                return
            L95:
                monitor-exit(r2)
                throw r12
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                r1 = this;
                r1.m65invoke()
                kotlin.n1 r0 = kotlin.n1.a
                return r0
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public void m65invoke() {
                r5 = this;
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR
                r1 = 0
                okhttp3.internal.http2.Http2Reader r2 = r5.reader     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27
                r2.readConnectionPreface(r5)     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27
            L8:
                okhttp3.internal.http2.Http2Reader r2 = r5.reader     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27
                r3 = 0
                boolean r2 = r2.nextFrame(r3, r5)     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27
                if (r2 != 0) goto L8
                okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.NO_ERROR     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
                okhttp3.internal.http2.Http2Connection r3 = r5.this$0
                r3.close$okhttp(r2, r0, r1)
            L1a:
                okhttp3.internal.http2.Http2Reader r0 = r5.reader
                okhttp3.internal._UtilCommonKt.closeQuietly(r0)
                return
            L20:
                r3 = move-exception
                goto L31
            L22:
                r1 = move-exception
                goto L29
            L24:
                r3 = move-exception
                r2 = r0
                goto L31
            L27:
                r1 = move-exception
                r2 = r0
            L29:
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch: java.lang.Throwable -> L20
                okhttp3.internal.http2.Http2Connection r2 = r5.this$0
                r2.close$okhttp(r0, r0, r1)
                goto L1a
            L31:
                okhttp3.internal.http2.Http2Connection r4 = r5.this$0
                r4.close$okhttp(r2, r0, r1)
                okhttp3.internal.http2.Http2Reader r0 = r5.reader
                okhttp3.internal._UtilCommonKt.closeQuietly(r0)
                throw r3
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean r9, int r10, int r11) {
                r8 = this;
                if (r9 == 0) goto L3c
                okhttp3.internal.http2.Http2Connection r9 = r8.this$0
                monitor-enter(r9)
                r11 = 1
                r0 = 1
                if (r10 == r11) goto L30
                r11 = 2
                if (r10 == r11) goto L27
                r11 = 3
                if (r10 == r11) goto L16
            L10:
                kotlin.n1 r10 = kotlin.n1.a     // Catch: java.lang.Throwable -> L13
                goto L38
            L13:
                r0 = move-exception
                r10 = r0
                goto L3a
            L16:
                long r10 = okhttp3.internal.http2.Http2Connection.access$getAwaitPongsReceived$p(r9)     // Catch: java.lang.Throwable -> L13
                long r10 = r10 + r0
                okhttp3.internal.http2.Http2Connection.access$setAwaitPongsReceived$p(r9, r10)     // Catch: java.lang.Throwable -> L13
                java.lang.String r10 = "null cannot be cast to non-null type java.lang.Object"
                kotlin.jvm.internal.g0.n(r9, r10)     // Catch: java.lang.Throwable -> L13
                r9.notifyAll()     // Catch: java.lang.Throwable -> L13
                goto L10
            L27:
                long r10 = okhttp3.internal.http2.Http2Connection.access$getDegradedPongsReceived$p(r9)     // Catch: java.lang.Throwable -> L13
                long r10 = r10 + r0
                okhttp3.internal.http2.Http2Connection.access$setDegradedPongsReceived$p(r9, r10)     // Catch: java.lang.Throwable -> L13
                goto L38
            L30:
                long r10 = okhttp3.internal.http2.Http2Connection.access$getIntervalPongsReceived$p(r9)     // Catch: java.lang.Throwable -> L13
                long r10 = r10 + r0
                okhttp3.internal.http2.Http2Connection.access$setIntervalPongsReceived$p(r9, r10)     // Catch: java.lang.Throwable -> L13
            L38:
                monitor-exit(r9)
                return
            L3a:
                monitor-exit(r9)
                throw r10
            L3c:
                okhttp3.internal.http2.Http2Connection r9 = r8.this$0
                okhttp3.internal.concurrent.TaskQueue r0 = okhttp3.internal.http2.Http2Connection.access$getWriterQueue$p(r9)
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                okhttp3.internal.http2.Http2Connection r1 = r8.this$0
                java.lang.String r1 = r1.getConnectionName$okhttp()
                r9.append(r1)
                java.lang.String r1 = " ping"
                r9.append(r1)
                java.lang.String r1 = r9.toString()
                okhttp3.internal.http2.Http2Connection r9 = r8.this$0
                okhttp3.internal.http2.i r5 = new okhttp3.internal.http2.i
                r5.<init>(r9, r10, r11)
                r6 = 6
                r7 = 0
                r2 = 0
                r4 = 0
                okhttp3.internal.concurrent.TaskQueue.execute$default(r0, r1, r2, r4, r5, r6, r7)
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int r1, int r2, int r3, boolean r4) {
                r0 = this;
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int r1, int r2, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r3) {
                r0 = this;
                java.lang.String r1 = "requestHeaders"
                kotlin.jvm.internal.g0.p(r3, r1)
                okhttp3.internal.http2.Http2Connection r1 = r0.this$0
                r1.pushRequestLater$okhttp(r2, r3)
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int r2, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r3) {
                r1 = this;
                java.lang.String r0 = "errorCode"
                kotlin.jvm.internal.g0.p(r3, r0)
                okhttp3.internal.http2.Http2Connection r0 = r1.this$0
                boolean r0 = r0.pushedStream$okhttp(r2)
                if (r0 == 0) goto L13
                okhttp3.internal.http2.Http2Connection r0 = r1.this$0
                r0.pushResetLater$okhttp(r2, r3)
                return
            L13:
                okhttp3.internal.http2.Http2Connection r0 = r1.this$0
                okhttp3.internal.http2.Http2Stream r2 = r0.removeStream$okhttp(r2)
                if (r2 == 0) goto L1e
                r2.receiveRstStream(r3)
            L1e:
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void settings(boolean r10, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.Settings r11) {
                r9 = this;
                java.lang.String r0 = "settings"
                kotlin.jvm.internal.g0.p(r11, r0)
                okhttp3.internal.http2.Http2Connection r0 = r9.this$0
                okhttp3.internal.concurrent.TaskQueue r1 = okhttp3.internal.http2.Http2Connection.access$getWriterQueue$p(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                okhttp3.internal.http2.Http2Connection r2 = r9.this$0
                java.lang.String r2 = r2.getConnectionName$okhttp()
                r0.append(r2)
                java.lang.String r2 = " applyAndAckSettings"
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                okhttp3.internal.http2.k r6 = new okhttp3.internal.http2.k
                r6.<init>(r9, r10, r11)
                r7 = 6
                r8 = 0
                r3 = 0
                r5 = 0
                okhttp3.internal.concurrent.TaskQueue.execute$default(r1, r2, r3, r5, r6, r7, r8)
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int r3, long r4) {
                r2 = this;
                if (r3 != 0) goto L1c
                okhttp3.internal.http2.Http2Connection r3 = r2.this$0
                monitor-enter(r3)
                long r0 = r3.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L19
                long r0 = r0 + r4
                okhttp3.internal.http2.Http2Connection.access$setWriteBytesMaximum$p(r3, r0)     // Catch: java.lang.Throwable -> L19
                java.lang.String r4 = "null cannot be cast to non-null type java.lang.Object"
                kotlin.jvm.internal.g0.n(r3, r4)     // Catch: java.lang.Throwable -> L19
                r3.notifyAll()     // Catch: java.lang.Throwable -> L19
                kotlin.n1 r4 = kotlin.n1.a     // Catch: java.lang.Throwable -> L19
                monitor-exit(r3)
                return
            L19:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            L1c:
                okhttp3.internal.http2.Http2Connection r0 = r2.this$0
                okhttp3.internal.http2.Http2Stream r3 = r0.getStream(r3)
                if (r3 == 0) goto L2f
                monitor-enter(r3)
                r3.addBytesToWriteWindow(r4)     // Catch: java.lang.Throwable -> L2c
                kotlin.n1 r4 = kotlin.n1.a     // Catch: java.lang.Throwable -> L2c
                monitor-exit(r3)
                return
            L2c:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            L2f:
                return
        }
    }

    static {
            okhttp3.internal.http2.Http2Connection$Companion r0 = new okhttp3.internal.http2.Http2Connection$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http2.Http2Connection.Companion = r0
            okhttp3.internal.http2.Settings r0 = new okhttp3.internal.http2.Settings
            r0.<init>()
            r1 = 4
            r2 = 65535(0xffff, float:9.1834E-41)
            r0.set(r1, r2)
            r1 = 5
            r2 = 16384(0x4000, float:2.2959E-41)
            r0.set(r1, r2)
            okhttp3.internal.http2.Http2Connection.DEFAULT_SETTINGS = r0
            return
    }

    public Http2Connection(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.Http2Connection.Builder r7) {
            r6 = this;
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.g0.p(r7, r0)
            r6.<init>()
            boolean r0 = r7.getClient$okhttp()
            r6.client = r0
            okhttp3.internal.http2.Http2Connection$Listener r1 = r7.getListener$okhttp()
            r6.listener = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r6.streams = r1
            java.lang.String r1 = r7.getConnectionName$okhttp()
            r6.connectionName = r1
            boolean r2 = r7.getClient$okhttp()
            if (r2 == 0) goto L29
            r2 = 3
            goto L2a
        L29:
            r2 = 2
        L2a:
            r6.nextStreamId = r2
            okhttp3.internal.concurrent.TaskRunner r2 = r7.getTaskRunner$okhttp()
            r6.taskRunner = r2
            okhttp3.internal.concurrent.TaskQueue r3 = r2.newQueue()
            r6.writerQueue = r3
            okhttp3.internal.concurrent.TaskQueue r4 = r2.newQueue()
            r6.pushQueue = r4
            okhttp3.internal.concurrent.TaskQueue r2 = r2.newQueue()
            r6.settingsListenerQueue = r2
            okhttp3.internal.http2.PushObserver r2 = r7.getPushObserver$okhttp()
            r6.pushObserver = r2
            okhttp3.internal.http2.FlowControlListener r2 = r7.getFlowControlListener$okhttp()
            r6.flowControlListener = r2
            okhttp3.internal.http2.Settings r2 = new okhttp3.internal.http2.Settings
            r2.<init>()
            boolean r4 = r7.getClient$okhttp()
            if (r4 == 0) goto L61
            r4 = 4
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            r2.set(r4, r5)
        L61:
            r6.okHttpSettings = r2
            okhttp3.internal.http2.Settings r2 = okhttp3.internal.http2.Http2Connection.DEFAULT_SETTINGS
            r6.peerSettings = r2
            okhttp3.internal.http2.flowcontrol.WindowCounter r2 = new okhttp3.internal.http2.flowcontrol.WindowCounter
            r4 = 0
            r2.<init>(r4)
            r6.readBytes = r2
            okhttp3.internal.http2.Settings r2 = r6.peerSettings
            int r2 = r2.getInitialWindowSize()
            long r4 = (long) r2
            r6.writeBytesMaximum = r4
            okhttp3.internal.connection.BufferedSocket r2 = r7.getSocket$okhttp()
            r6.socket = r2
            okhttp3.internal.http2.Http2Writer r4 = new okhttp3.internal.http2.Http2Writer
            okio.BufferedSink r5 = r2.getSink()
            r4.<init>(r5, r0)
            r6.writer = r4
            okhttp3.internal.http2.Http2Connection$ReaderRunnable r4 = new okhttp3.internal.http2.Http2Connection$ReaderRunnable
            okhttp3.internal.http2.Http2Reader r5 = new okhttp3.internal.http2.Http2Reader
            okio.BufferedSource r2 = r2.getSource()
            r5.<init>(r2, r0)
            r4.<init>(r6, r5)
            r6.readerRunnable = r4
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r6.currentPushRequests = r0
            int r0 = r7.getPingIntervalMillis$okhttp()
            if (r0 == 0) goto Lca
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            int r7 = r7.getPingIntervalMillis$okhttp()
            long r4 = (long) r7
            long r4 = r0.toNanos(r4)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            java.lang.String r0 = " ping"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            okhttp3.internal.http2.b r0 = new okhttp3.internal.http2.b
            r0.<init>(r6, r4)
            r3.schedule(r7, r4, r0)
        Lca:
            return
    }

    private static final long _init_$lambda$0(okhttp3.internal.http2.Http2Connection r7, long r8) {
            monitor-enter(r7)
            long r0 = r7.intervalPongsReceived     // Catch: java.lang.Throwable -> L21
            long r2 = r7.intervalPingsSent     // Catch: java.lang.Throwable -> L21
            r4 = 1
            r5 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto Ld
            r0 = 1
            goto L13
        Ld:
            r0 = 1
            long r2 = r2 + r0
            r7.intervalPingsSent = r2     // Catch: java.lang.Throwable -> L21
            r0 = 0
        L13:
            monitor-exit(r7)
            if (r0 == 0) goto L1d
            r8 = 0
            r7.failConnection(r8)
            r7 = -1
            return r7
        L1d:
            r7.writePing(r5, r4, r5)
            return r8
        L21:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }

    public static /* synthetic */ kotlin.n1 a(okhttp3.internal.http2.Http2Connection r0, int r1, java.util.List r2) {
            kotlin.n1 r0 = pushRequestLater$lambda$1(r0, r1, r2)
            return r0
    }

    public static final /* synthetic */ void access$failConnection(okhttp3.internal.http2.Http2Connection r0, java.io.IOException r1) {
            r0.failConnection(r1)
            return
    }

    public static final /* synthetic */ long access$getAwaitPongsReceived$p(okhttp3.internal.http2.Http2Connection r2) {
            long r0 = r2.awaitPongsReceived
            return r0
    }

    public static final /* synthetic */ okhttp3.internal.http2.Settings access$getDEFAULT_SETTINGS$cp() {
            okhttp3.internal.http2.Settings r0 = okhttp3.internal.http2.Http2Connection.DEFAULT_SETTINGS
            return r0
    }

    public static final /* synthetic */ long access$getDegradedPongsReceived$p(okhttp3.internal.http2.Http2Connection r2) {
            long r0 = r2.degradedPongsReceived
            return r0
    }

    public static final /* synthetic */ long access$getIntervalPongsReceived$p(okhttp3.internal.http2.Http2Connection r2) {
            long r0 = r2.intervalPongsReceived
            return r0
    }

    public static final /* synthetic */ okhttp3.internal.concurrent.TaskQueue access$getSettingsListenerQueue$p(okhttp3.internal.http2.Http2Connection r0) {
            okhttp3.internal.concurrent.TaskQueue r0 = r0.settingsListenerQueue
            return r0
    }

    public static final /* synthetic */ okhttp3.internal.concurrent.TaskRunner access$getTaskRunner$p(okhttp3.internal.http2.Http2Connection r0) {
            okhttp3.internal.concurrent.TaskRunner r0 = r0.taskRunner
            return r0
    }

    public static final /* synthetic */ okhttp3.internal.concurrent.TaskQueue access$getWriterQueue$p(okhttp3.internal.http2.Http2Connection r0) {
            okhttp3.internal.concurrent.TaskQueue r0 = r0.writerQueue
            return r0
    }

    public static final /* synthetic */ boolean access$isShutdown$p(okhttp3.internal.http2.Http2Connection r0) {
            boolean r0 = r0.isShutdown
            return r0
    }

    public static final /* synthetic */ void access$setAwaitPongsReceived$p(okhttp3.internal.http2.Http2Connection r0, long r1) {
            r0.awaitPongsReceived = r1
            return
    }

    public static final /* synthetic */ void access$setDegradedPongsReceived$p(okhttp3.internal.http2.Http2Connection r0, long r1) {
            r0.degradedPongsReceived = r1
            return
    }

    public static final /* synthetic */ void access$setIntervalPongsReceived$p(okhttp3.internal.http2.Http2Connection r0, long r1) {
            r0.intervalPongsReceived = r1
            return
    }

    public static final /* synthetic */ void access$setShutdown$p(okhttp3.internal.http2.Http2Connection r0, boolean r1) {
            r0.isShutdown = r1
            return
    }

    public static final /* synthetic */ void access$setWriteBytesMaximum$p(okhttp3.internal.http2.Http2Connection r0, long r1) {
            r0.writeBytesMaximum = r1
            return
    }

    public static /* synthetic */ kotlin.n1 b(okhttp3.internal.http2.Http2Connection r0, int r1, okhttp3.internal.http2.ErrorCode r2) {
            kotlin.n1 r0 = pushResetLater$lambda$0(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 c(okhttp3.internal.http2.Http2Connection r0, int r1, long r2) {
            kotlin.n1 r0 = writeWindowUpdateLater$lambda$0(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 d(okhttp3.internal.http2.Http2Connection r0, int r1, okio.Buffer r2, int r3, boolean r4) {
            kotlin.n1 r0 = pushDataLater$lambda$0(r0, r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ long e(okhttp3.internal.http2.Http2Connection r0, long r1) {
            long r0 = _init_$lambda$0(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 f(okhttp3.internal.http2.Http2Connection r0, int r1, java.util.List r2, boolean r3) {
            kotlin.n1 r0 = pushHeadersLater$lambda$0(r0, r1, r2, r3)
            return r0
    }

    private final void failConnection(java.io.IOException r2) {
            r1 = this;
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR
            r1.close$okhttp(r0, r0, r2)
            return
    }

    public static /* synthetic */ kotlin.n1 g(okhttp3.internal.http2.Http2Connection r0) {
            kotlin.n1 r0 = sendDegradedPingLater$lambda$1(r0)
            return r0
    }

    public static /* synthetic */ kotlin.n1 h(okhttp3.internal.http2.Http2Connection r0, int r1, okhttp3.internal.http2.ErrorCode r2) {
            kotlin.n1 r0 = writeSynResetLater$lambda$0(r0, r1, r2)
            return r0
    }

    private final okhttp3.internal.http2.Http2Stream newStream(int r10, java.util.List<okhttp3.internal.http2.Header> r11, boolean r12) throws java.io.IOException {
            r9 = this;
            r3 = r12 ^ 1
            okhttp3.internal.http2.Http2Writer r6 = r9.writer
            monitor-enter(r6)
            monitor-enter(r9)     // Catch: java.lang.Throwable -> L8a
            int r0 = r9.nextStreamId     // Catch: java.lang.Throwable -> L7e
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L18
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch: java.lang.Throwable -> L13
            r9.shutdown(r0)     // Catch: java.lang.Throwable -> L13
            goto L18
        L13:
            r0 = move-exception
            r10 = r0
            r2 = r9
            goto L88
        L18:
            boolean r0 = r9.isShutdown     // Catch: java.lang.Throwable -> L7e
            if (r0 != 0) goto L81
            int r1 = r9.nextStreamId     // Catch: java.lang.Throwable -> L7e
            int r0 = r1 + 2
            r9.nextStreamId = r0     // Catch: java.lang.Throwable -> L7e
            okhttp3.internal.http2.Http2Stream r0 = new okhttp3.internal.http2.Http2Stream     // Catch: java.lang.Throwable -> L7e
            r5 = 0
            r4 = 0
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L43
            if (r12 == 0) goto L46
            long r4 = r2.writeBytesTotal     // Catch: java.lang.Throwable -> L43
            long r7 = r2.writeBytesMaximum     // Catch: java.lang.Throwable -> L43
            int r12 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r12 >= 0) goto L46
            long r4 = r0.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L43
            long r7 = r0.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L43
            int r12 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r12 < 0) goto L41
            goto L46
        L41:
            r12 = 0
            goto L47
        L43:
            r0 = move-exception
        L44:
            r10 = r0
            goto L88
        L46:
            r12 = 1
        L47:
            boolean r4 = r0.isOpen()     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L56
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r4 = r2.streams     // Catch: java.lang.Throwable -> L43
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L43
            r4.put(r5, r0)     // Catch: java.lang.Throwable -> L43
        L56:
            kotlin.n1 r4 = kotlin.n1.a     // Catch: java.lang.Throwable -> L43
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L61
            if (r10 != 0) goto L64
            okhttp3.internal.http2.Http2Writer r10 = r2.writer     // Catch: java.lang.Throwable -> L61
            r10.headers(r3, r1, r11)     // Catch: java.lang.Throwable -> L61
            goto L6d
        L61:
            r0 = move-exception
        L62:
            r10 = r0
            goto L8d
        L64:
            boolean r3 = r2.client     // Catch: java.lang.Throwable -> L61
            if (r3 != 0) goto L76
            okhttp3.internal.http2.Http2Writer r3 = r2.writer     // Catch: java.lang.Throwable -> L61
            r3.pushPromise(r10, r1, r11)     // Catch: java.lang.Throwable -> L61
        L6d:
            monitor-exit(r6)
            if (r12 == 0) goto L75
            okhttp3.internal.http2.Http2Writer r10 = r2.writer
            r10.flush()
        L75:
            return r0
        L76:
            java.lang.String r10 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L61
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L61
            throw r11     // Catch: java.lang.Throwable -> L61
        L7e:
            r0 = move-exception
            r2 = r9
            goto L44
        L81:
            r2 = r9
            okhttp3.internal.http2.ConnectionShutdownException r10 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L43
            r10.<init>()     // Catch: java.lang.Throwable -> L43
            throw r10     // Catch: java.lang.Throwable -> L43
        L88:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L61
            throw r10     // Catch: java.lang.Throwable -> L61
        L8a:
            r0 = move-exception
            r2 = r9
            goto L62
        L8d:
            monitor-exit(r6)
            throw r10
    }

    private static final kotlin.n1 pushDataLater$lambda$0(okhttp3.internal.http2.Http2Connection r1, int r2, okio.Buffer r3, int r4, boolean r5) {
            okhttp3.internal.http2.PushObserver r0 = r1.pushObserver     // Catch: java.io.IOException -> L24
            boolean r3 = r0.onData(r2, r3, r4, r5)     // Catch: java.io.IOException -> L24
            if (r3 == 0) goto Lf
            okhttp3.internal.http2.Http2Writer r4 = r1.writer     // Catch: java.io.IOException -> L24
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch: java.io.IOException -> L24
            r4.rstStream(r2, r0)     // Catch: java.io.IOException -> L24
        Lf:
            if (r3 != 0) goto L13
            if (r5 == 0) goto L24
        L13:
            monitor-enter(r1)     // Catch: java.io.IOException -> L24
            java.util.Set<java.lang.Integer> r3 = r1.currentPushRequests     // Catch: java.lang.Throwable -> L21
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L21
            r3.remove(r2)     // Catch: java.lang.Throwable -> L21
            kotlin.n1 r2 = kotlin.n1.a     // Catch: java.lang.Throwable -> L21
            monitor-exit(r1)     // Catch: java.io.IOException -> L24
            goto L24
        L21:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.io.IOException -> L24
            throw r2     // Catch: java.io.IOException -> L24
        L24:
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final kotlin.n1 pushHeadersLater$lambda$0(okhttp3.internal.http2.Http2Connection r2, int r3, java.util.List r4, boolean r5) {
            okhttp3.internal.http2.PushObserver r0 = r2.pushObserver
            boolean r4 = r0.onHeaders(r3, r4, r5)
            if (r4 == 0) goto Lf
            okhttp3.internal.http2.Http2Writer r0 = r2.writer     // Catch: java.io.IOException -> L24
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch: java.io.IOException -> L24
            r0.rstStream(r3, r1)     // Catch: java.io.IOException -> L24
        Lf:
            if (r4 != 0) goto L13
            if (r5 == 0) goto L24
        L13:
            monitor-enter(r2)     // Catch: java.io.IOException -> L24
            java.util.Set<java.lang.Integer> r4 = r2.currentPushRequests     // Catch: java.lang.Throwable -> L21
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L21
            r4.remove(r3)     // Catch: java.lang.Throwable -> L21
            kotlin.n1 r3 = kotlin.n1.a     // Catch: java.lang.Throwable -> L21
            monitor-exit(r2)     // Catch: java.io.IOException -> L24
            goto L24
        L21:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.io.IOException -> L24
            throw r3     // Catch: java.io.IOException -> L24
        L24:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    private static final kotlin.n1 pushRequestLater$lambda$1(okhttp3.internal.http2.Http2Connection r1, int r2, java.util.List r3) {
            okhttp3.internal.http2.PushObserver r0 = r1.pushObserver
            boolean r3 = r0.onRequest(r2, r3)
            if (r3 == 0) goto L20
            okhttp3.internal.http2.Http2Writer r3 = r1.writer     // Catch: java.io.IOException -> L20
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch: java.io.IOException -> L20
            r3.rstStream(r2, r0)     // Catch: java.io.IOException -> L20
            monitor-enter(r1)     // Catch: java.io.IOException -> L20
            java.util.Set<java.lang.Integer> r3 = r1.currentPushRequests     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1d
            r3.remove(r2)     // Catch: java.lang.Throwable -> L1d
            kotlin.n1 r2 = kotlin.n1.a     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r1)     // Catch: java.io.IOException -> L20
            goto L20
        L1d:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.io.IOException -> L20
            throw r2     // Catch: java.io.IOException -> L20
        L20:
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final kotlin.n1 pushResetLater$lambda$0(okhttp3.internal.http2.Http2Connection r1, int r2, okhttp3.internal.http2.ErrorCode r3) {
            okhttp3.internal.http2.PushObserver r0 = r1.pushObserver
            r0.onReset(r2, r3)
            monitor-enter(r1)
            java.util.Set<java.lang.Integer> r3 = r1.currentPushRequests     // Catch: java.lang.Throwable -> L13
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L13
            r3.remove(r2)     // Catch: java.lang.Throwable -> L13
            kotlin.n1 r2 = kotlin.n1.a     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return r2
        L13:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    private static final kotlin.n1 sendDegradedPingLater$lambda$1(okhttp3.internal.http2.Http2Connection r2) {
            r0 = 0
            r1 = 2
            r2.writePing(r0, r1, r0)
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    public static /* synthetic */ void start$default(okhttp3.internal.http2.Http2Connection r0, boolean r1, int r2, java.lang.Object r3) throws java.io.IOException {
            r3 = 1
            r2 = r2 & r3
            if (r2 == 0) goto L5
            r1 = 1
        L5:
            r0.start(r1)
            return
    }

    private static final kotlin.n1 writeSynResetLater$lambda$0(okhttp3.internal.http2.Http2Connection r0, int r1, okhttp3.internal.http2.ErrorCode r2) {
            r0.writeSynReset$okhttp(r1, r2)     // Catch: java.io.IOException -> L4
            goto L8
        L4:
            r1 = move-exception
            r0.failConnection(r1)
        L8:
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private static final kotlin.n1 writeWindowUpdateLater$lambda$0(okhttp3.internal.http2.Http2Connection r1, int r2, long r3) {
            okhttp3.internal.http2.Http2Writer r0 = r1.writer     // Catch: java.io.IOException -> L6
            r0.windowUpdate(r2, r3)     // Catch: java.io.IOException -> L6
            goto La
        L6:
            r2 = move-exception
            r1.failConnection(r2)
        La:
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public final void awaitPong() throws java.lang.InterruptedException {
            r5 = this;
            monitor-enter(r5)
        L1:
            long r0 = r5.awaitPongsReceived     // Catch: java.lang.Throwable -> L12
            long r2 = r5.awaitPingsSent     // Catch: java.lang.Throwable -> L12
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L14
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.g0.n(r5, r0)     // Catch: java.lang.Throwable -> L12
            r5.wait()     // Catch: java.lang.Throwable -> L12
            goto L1
        L12:
            r0 = move-exception
            goto L18
        L14:
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L12
            monitor-exit(r5)
            return
        L18:
            monitor-exit(r5)
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.NO_ERROR
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.CANCEL
            r2 = 0
            r3.close$okhttp(r0, r1, r2)
            return
    }

    public final void close$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r4, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r5, @org.jetbrains.annotations.Nullable java.io.IOException r6) {
            r3 = this;
            java.lang.String r0 = "connectionCode"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "streamCode"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r0 == 0) goto L3c
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto L15
            goto L3c
        L15:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Thread "
            r5.append(r6)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            r5.append(r6)
            java.lang.String r6 = " MUST NOT hold lock on "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L3c:
            r3.shutdown(r4)     // Catch: java.io.IOException -> L3f
        L3f:
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r4 = r3.streams     // Catch: java.lang.Throwable -> L5b
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L5b
            r0 = 0
            if (r4 != 0) goto L5d
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r4 = r3.streams     // Catch: java.lang.Throwable -> L5b
            java.util.Collection r4 = r4.values()     // Catch: java.lang.Throwable -> L5b
            okhttp3.internal.http2.Http2Stream[] r1 = new okhttp3.internal.http2.Http2Stream[r0]     // Catch: java.lang.Throwable -> L5b
            java.lang.Object[] r4 = r4.toArray(r1)     // Catch: java.lang.Throwable -> L5b
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r1 = r3.streams     // Catch: java.lang.Throwable -> L5b
            r1.clear()     // Catch: java.lang.Throwable -> L5b
            goto L5e
        L5b:
            r4 = move-exception
            goto L8a
        L5d:
            r4 = 0
        L5e:
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r3)
            okhttp3.internal.http2.Http2Stream[] r4 = (okhttp3.internal.http2.Http2Stream[]) r4
            if (r4 == 0) goto L70
            int r1 = r4.length
        L66:
            if (r0 >= r1) goto L70
            r2 = r4[r0]
            r2.close(r5, r6)     // Catch: java.io.IOException -> L6d
        L6d:
            int r0 = r0 + 1
            goto L66
        L70:
            okhttp3.internal.http2.Http2Writer r4 = r3.writer     // Catch: java.io.IOException -> L75
            r4.close()     // Catch: java.io.IOException -> L75
        L75:
            okhttp3.internal.connection.BufferedSocket r4 = r3.socket     // Catch: java.io.IOException -> L7a
            r4.cancel()     // Catch: java.io.IOException -> L7a
        L7a:
            okhttp3.internal.concurrent.TaskQueue r4 = r3.writerQueue
            r4.shutdown()
            okhttp3.internal.concurrent.TaskQueue r4 = r3.pushQueue
            r4.shutdown()
            okhttp3.internal.concurrent.TaskQueue r4 = r3.settingsListenerQueue
            r4.shutdown()
            return
        L8a:
            monitor-exit(r3)
            throw r4
    }

    public final void flush() throws java.io.IOException {
            r1 = this;
            okhttp3.internal.http2.Http2Writer r0 = r1.writer
            r0.flush()
            return
    }

    public final boolean getClient$okhttp() {
            r1 = this;
            boolean r0 = r1.client
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getConnectionName$okhttp() {
            r1 = this;
            java.lang.String r0 = r1.connectionName
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.FlowControlListener getFlowControlListener$okhttp() {
            r1 = this;
            okhttp3.internal.http2.FlowControlListener r0 = r1.flowControlListener
            return r0
    }

    public final int getLastGoodStreamId$okhttp() {
            r1 = this;
            int r0 = r1.lastGoodStreamId
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.Http2Connection.Listener getListener$okhttp() {
            r1 = this;
            okhttp3.internal.http2.Http2Connection$Listener r0 = r1.listener
            return r0
    }

    public final int getNextStreamId$okhttp() {
            r1 = this;
            int r0 = r1.nextStreamId
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.Settings getOkHttpSettings() {
            r1 = this;
            okhttp3.internal.http2.Settings r0 = r1.okHttpSettings
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.Settings getPeerSettings() {
            r1 = this;
            okhttp3.internal.http2.Settings r0 = r1.peerSettings
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.flowcontrol.WindowCounter getReadBytes() {
            r1 = this;
            okhttp3.internal.http2.flowcontrol.WindowCounter r0 = r1.readBytes
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.Http2Connection.ReaderRunnable getReaderRunnable() {
            r1 = this;
            okhttp3.internal.http2.Http2Connection$ReaderRunnable r0 = r1.readerRunnable
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.connection.BufferedSocket getSocket$okhttp() {
            r1 = this;
            okhttp3.internal.connection.BufferedSocket r0 = r1.socket
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.internal.http2.Http2Stream getStream(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r1.streams     // Catch: java.lang.Throwable -> Lf
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> Lf
            okhttp3.internal.http2.Http2Stream r2 = (okhttp3.internal.http2.Http2Stream) r2     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return r2
        Lf:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> getStreams$okhttp() {
            r1 = this;
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r1.streams
            return r0
    }

    public final long getWriteBytesMaximum() {
            r2 = this;
            long r0 = r2.writeBytesMaximum
            return r0
    }

    public final long getWriteBytesTotal() {
            r2 = this;
            long r0 = r2.writeBytesTotal
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.Http2Writer getWriter() {
            r1 = this;
            okhttp3.internal.http2.Http2Writer r0 = r1.writer
            return r0
    }

    public final boolean isHealthy(long r7) {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.isShutdown     // Catch: java.lang.Throwable -> L18
            r1 = 0
            if (r0 == 0) goto L8
            monitor-exit(r6)
            return r1
        L8:
            long r2 = r6.degradedPongsReceived     // Catch: java.lang.Throwable -> L18
            long r4 = r6.degradedPingsSent     // Catch: java.lang.Throwable -> L18
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L1a
            long r2 = r6.degradedPongDeadlineNs     // Catch: java.lang.Throwable -> L18
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 < 0) goto L1a
            monitor-exit(r6)
            return r1
        L18:
            r7 = move-exception
            goto L1d
        L1a:
            monitor-exit(r6)
            r7 = 1
            return r7
        L1d:
            monitor-exit(r6)
            throw r7
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.Http2Stream newStream(@org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r2, boolean r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "requestHeaders"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            okhttp3.internal.http2.Http2Stream r2 = r1.newStream(r0, r2, r3)
            return r2
    }

    public final int openStreamCount() {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r1.streams     // Catch: java.lang.Throwable -> L9
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final void pushDataLater$okhttp(int r15, @org.jetbrains.annotations.NotNull okio.BufferedSource r16, int r17, boolean r18) throws java.io.IOException {
            r14 = this;
            r0 = r16
            java.lang.String r1 = "source"
            kotlin.jvm.internal.g0.p(r0, r1)
            okio.Buffer r5 = new okio.Buffer
            r5.<init>()
            r6 = r17
            long r1 = (long) r6
            r0.require(r1)
            r0.read(r5, r1)
            okhttp3.internal.concurrent.TaskQueue r0 = r14.pushQueue
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r14.connectionName
            r1.append(r2)
            r2 = 91
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = "] onData"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            okhttp3.internal.http2.a r11 = new okhttp3.internal.http2.a
            r3 = r14
            r4 = r15
            r7 = r18
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            r12 = 6
            r13 = 0
            r8 = 0
            r10 = 0
            r6 = r0
            r7 = r1
            okhttp3.internal.concurrent.TaskQueue.execute$default(r6, r7, r8, r10, r11, r12, r13)
            return
    }

    public final void pushHeadersLater$okhttp(int r10, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r11, boolean r12) {
            r9 = this;
            java.lang.String r0 = "requestHeaders"
            kotlin.jvm.internal.g0.p(r11, r0)
            okhttp3.internal.concurrent.TaskQueue r1 = r9.pushQueue
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r9.connectionName
            r0.append(r2)
            r2 = 91
            r0.append(r2)
            r0.append(r10)
            java.lang.String r2 = "] onHeaders"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            okhttp3.internal.http2.g r6 = new okhttp3.internal.http2.g
            r6.<init>(r9, r10, r11, r12)
            r7 = 6
            r8 = 0
            r3 = 0
            r5 = 0
            okhttp3.internal.concurrent.TaskQueue.execute$default(r1, r2, r3, r5, r6, r7, r8)
            return
    }

    public final void pushRequestLater$okhttp(int r11, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r12) {
            r10 = this;
            java.lang.String r0 = "requestHeaders"
            kotlin.jvm.internal.g0.p(r12, r0)
            monitor-enter(r10)
            java.util.Set<java.lang.Integer> r0 = r10.currentPushRequests     // Catch: java.lang.Throwable -> L19
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L19
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1c
            okhttp3.internal.http2.ErrorCode r12 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch: java.lang.Throwable -> L19
            r10.writeSynResetLater$okhttp(r11, r12)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r10)
            return
        L19:
            r0 = move-exception
            r11 = r0
            goto L51
        L1c:
            java.util.Set<java.lang.Integer> r0 = r10.currentPushRequests     // Catch: java.lang.Throwable -> L19
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L19
            r0.add(r1)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r10)
            okhttp3.internal.concurrent.TaskQueue r2 = r10.pushQueue
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r10.connectionName
            r0.append(r1)
            r1 = 91
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = "] onRequest"
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            okhttp3.internal.http2.f r7 = new okhttp3.internal.http2.f
            r7.<init>(r10, r11, r12)
            r8 = 6
            r9 = 0
            r4 = 0
            r6 = 0
            okhttp3.internal.concurrent.TaskQueue.execute$default(r2, r3, r4, r6, r7, r8, r9)
            return
        L51:
            monitor-exit(r10)
            throw r11
    }

    public final void pushResetLater$okhttp(int r10, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r11) {
            r9 = this;
            java.lang.String r0 = "errorCode"
            kotlin.jvm.internal.g0.p(r11, r0)
            okhttp3.internal.concurrent.TaskQueue r1 = r9.pushQueue
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r9.connectionName
            r0.append(r2)
            r2 = 91
            r0.append(r2)
            r0.append(r10)
            java.lang.String r2 = "] onReset"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            okhttp3.internal.http2.h r6 = new okhttp3.internal.http2.h
            r6.<init>(r9, r10, r11)
            r7 = 6
            r8 = 0
            r3 = 0
            r5 = 0
            okhttp3.internal.concurrent.TaskQueue.execute$default(r1, r2, r3, r5, r6, r7, r8)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.Http2Stream pushStream(int r2, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r3, boolean r4) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "requestHeaders"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r1.client
            if (r0 != 0) goto Le
            okhttp3.internal.http2.Http2Stream r2 = r1.newStream(r2, r3, r4)
            return r2
        Le:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Client cannot push requests."
            r2.<init>(r3)
            throw r2
    }

    public final boolean pushedStream$okhttp(int r2) {
            r1 = this;
            if (r2 == 0) goto L7
            r0 = 1
            r2 = r2 & r0
            if (r2 != 0) goto L7
            return r0
        L7:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.internal.http2.Http2Stream removeStream$okhttp(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r1.streams     // Catch: java.lang.Throwable -> L17
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> L17
            okhttp3.internal.http2.Http2Stream r2 = (okhttp3.internal.http2.Http2Stream) r2     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.g0.n(r1, r0)     // Catch: java.lang.Throwable -> L17
            r1.notifyAll()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            return r2
        L17:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final void sendDegradedPingLater$okhttp() {
            r9 = this;
            monitor-enter(r9)
            long r0 = r9.degradedPongsReceived     // Catch: java.lang.Throwable -> L41
            long r2 = r9.degradedPingsSent     // Catch: java.lang.Throwable -> L41
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lb
            monitor-exit(r9)
            return
        Lb:
            r0 = 1
            long r2 = r2 + r0
            r9.degradedPingsSent = r2     // Catch: java.lang.Throwable -> L41
            long r0 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L41
            r2 = 1000000000(0x3b9aca00, float:0.0047237873)
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L41
            long r0 = r0 + r2
            r9.degradedPongDeadlineNs = r0     // Catch: java.lang.Throwable -> L41
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L41
            monitor-exit(r9)
            okhttp3.internal.concurrent.TaskQueue r1 = r9.writerQueue
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r9.connectionName
            r0.append(r2)
            java.lang.String r2 = " ping"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            okhttp3.internal.http2.d r6 = new okhttp3.internal.http2.d
            r6.<init>(r9)
            r7 = 6
            r8 = 0
            r3 = 0
            r5 = 0
            okhttp3.internal.concurrent.TaskQueue.execute$default(r1, r2, r3, r5, r6, r7, r8)
            return
        L41:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
    }

    public final void setLastGoodStreamId$okhttp(int r1) {
            r0 = this;
            r0.lastGoodStreamId = r1
            return
    }

    public final void setNextStreamId$okhttp(int r1) {
            r0 = this;
            r0.nextStreamId = r1
            return
    }

    public final void setPeerSettings(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.Settings r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.peerSettings = r2
            return
    }

    public final void setSettings(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.Settings r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "settings"
            kotlin.jvm.internal.g0.p(r3, r0)
            okhttp3.internal.http2.Http2Writer r0 = r2.writer
            monitor-enter(r0)
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r2.isShutdown     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L20
            okhttp3.internal.http2.Settings r1 = r2.okHttpSettings     // Catch: java.lang.Throwable -> L1e
            r1.merge(r3)     // Catch: java.lang.Throwable -> L1e
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            okhttp3.internal.http2.Http2Writer r1 = r2.writer     // Catch: java.lang.Throwable -> L1c
            r1.settings(r3)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return
        L1c:
            r3 = move-exception
            goto L28
        L1e:
            r3 = move-exception
            goto L26
        L20:
            okhttp3.internal.http2.ConnectionShutdownException r3 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L1e
            r3.<init>()     // Catch: java.lang.Throwable -> L1e
            throw r3     // Catch: java.lang.Throwable -> L1e
        L26:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r3     // Catch: java.lang.Throwable -> L1c
        L28:
            monitor-exit(r0)
            throw r3
    }

    public final void shutdown(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r5) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "statusCode"
            kotlin.jvm.internal.g0.p(r5, r0)
            okhttp3.internal.http2.Http2Writer r0 = r4.writer
            monitor-enter(r0)
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L10
            boolean r1 = r4.isShutdown     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L12
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return
        L10:
            r5 = move-exception
            goto L26
        L12:
            r1 = 1
            r4.isShutdown = r1     // Catch: java.lang.Throwable -> L23
            int r1 = r4.lastGoodStreamId     // Catch: java.lang.Throwable -> L23
            kotlin.n1 r2 = kotlin.n1.a     // Catch: java.lang.Throwable -> L23
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L10
            okhttp3.internal.http2.Http2Writer r2 = r4.writer     // Catch: java.lang.Throwable -> L10
            byte[] r3 = okhttp3.internal._UtilCommonKt.EMPTY_BYTE_ARRAY     // Catch: java.lang.Throwable -> L10
            r2.goAway(r1, r5, r3)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return
        L23:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L10
            throw r5     // Catch: java.lang.Throwable -> L10
        L26:
            monitor-exit(r0)
            throw r5
    }

    @kotlin.jvm.JvmOverloads
    public final void start() throws java.io.IOException {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            start$default(r3, r2, r0, r1)
            return
    }

    @kotlin.jvm.JvmOverloads
    public final void start(boolean r9) throws java.io.IOException {
            r8 = this;
            if (r9 == 0) goto L21
            okhttp3.internal.http2.Http2Writer r9 = r8.writer
            r9.connectionPreface()
            okhttp3.internal.http2.Http2Writer r9 = r8.writer
            okhttp3.internal.http2.Settings r0 = r8.okHttpSettings
            r9.settings(r0)
            okhttp3.internal.http2.Settings r9 = r8.okHttpSettings
            int r9 = r9.getInitialWindowSize()
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r9 == r0) goto L21
            okhttp3.internal.http2.Http2Writer r1 = r8.writer
            int r9 = r9 - r0
            long r2 = (long) r9
            r9 = 0
            r1.windowUpdate(r9, r2)
        L21:
            okhttp3.internal.concurrent.TaskRunner r9 = r8.taskRunner
            okhttp3.internal.concurrent.TaskQueue r0 = r9.newQueue()
            java.lang.String r1 = r8.connectionName
            okhttp3.internal.http2.Http2Connection$ReaderRunnable r5 = r8.readerRunnable
            r6 = 6
            r7 = 0
            r2 = 0
            r4 = 0
            okhttp3.internal.concurrent.TaskQueue.execute$default(r0, r1, r2, r4, r5, r6, r7)
            return
    }

    public final void updateConnectionFlowControl$okhttp(long r8) {
            r7 = this;
            monitor-enter(r7)
            okhttp3.internal.http2.flowcontrol.WindowCounter r0 = r7.readBytes     // Catch: java.lang.Throwable -> L2c
            r5 = 2
            r6 = 0
            r3 = 0
            r1 = r8
            okhttp3.internal.http2.flowcontrol.WindowCounter.update$default(r0, r1, r3, r5, r6)     // Catch: java.lang.Throwable -> L2c
            okhttp3.internal.http2.flowcontrol.WindowCounter r8 = r7.readBytes     // Catch: java.lang.Throwable -> L2c
            long r3 = r8.getUnacknowledged()     // Catch: java.lang.Throwable -> L2c
            okhttp3.internal.http2.Settings r8 = r7.okHttpSettings     // Catch: java.lang.Throwable -> L2c
            int r8 = r8.getInitialWindowSize()     // Catch: java.lang.Throwable -> L2c
            int r8 = r8 / 2
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L2c
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 < 0) goto L2f
            r8 = 0
            r7.writeWindowUpdateLater$okhttp(r8, r3)     // Catch: java.lang.Throwable -> L2c
            okhttp3.internal.http2.flowcontrol.WindowCounter r0 = r7.readBytes     // Catch: java.lang.Throwable -> L2c
            r5 = 1
            r6 = 0
            r1 = 0
            okhttp3.internal.http2.flowcontrol.WindowCounter.update$default(r0, r1, r3, r5, r6)     // Catch: java.lang.Throwable -> L2c
            goto L2f
        L2c:
            r0 = move-exception
            r8 = r0
            goto L3a
        L2f:
            okhttp3.internal.http2.FlowControlListener r8 = r7.flowControlListener     // Catch: java.lang.Throwable -> L2c
            okhttp3.internal.http2.flowcontrol.WindowCounter r9 = r7.readBytes     // Catch: java.lang.Throwable -> L2c
            r8.receivingConnectionWindowChanged(r9)     // Catch: java.lang.Throwable -> L2c
            kotlin.n1 r8 = kotlin.n1.a     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r7)
            return
        L3a:
            monitor-exit(r7)
            throw r8
    }

    public final void writeData(int r9, boolean r10, @org.jetbrains.annotations.Nullable okio.Buffer r11, long r12) throws java.io.IOException {
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            okhttp3.internal.http2.Http2Writer r12 = r8.writer
            r12.data(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L71
            monitor-enter(r8)
        L12:
            long r3 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            long r5 = r8.writeBytesMaximum     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L39
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r3 = r8.streams     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            if (r3 == 0) goto L31
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.g0.n(r8, r3)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            r8.wait()     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            goto L12
        L2f:
            r9 = move-exception
            goto L6f
        L31:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            throw r9     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
        L39:
            long r5 = r5 - r3
            long r3 = java.lang.Math.min(r12, r5)     // Catch: java.lang.Throwable -> L2f
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L2f
            okhttp3.internal.http2.Http2Writer r3 = r8.writer     // Catch: java.lang.Throwable -> L2f
            int r3 = r3.maxDataLength()     // Catch: java.lang.Throwable -> L2f
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L2f
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L2f
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L2f
            long r4 = r4 + r6
            r8.writeBytesTotal = r4     // Catch: java.lang.Throwable -> L2f
            kotlin.n1 r4 = kotlin.n1.a     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r8)
            long r12 = r12 - r6
            okhttp3.internal.http2.Http2Writer r4 = r8.writer
            if (r10 == 0) goto L5d
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L5d
            r5 = 1
            goto L5e
        L5d:
            r5 = 0
        L5e:
            r4.data(r5, r9, r11, r3)
            goto Ld
        L62:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2f
            r9.interrupt()     // Catch: java.lang.Throwable -> L2f
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2f
            r9.<init>()     // Catch: java.lang.Throwable -> L2f
            throw r9     // Catch: java.lang.Throwable -> L2f
        L6f:
            monitor-exit(r8)
            throw r9
        L71:
            return
    }

    public final void writeHeaders$okhttp(int r2, boolean r3, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r4) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "alternating"
            kotlin.jvm.internal.g0.p(r4, r0)
            okhttp3.internal.http2.Http2Writer r0 = r1.writer
            r0.headers(r3, r2, r4)
            return
    }

    public final void writePing() throws java.lang.InterruptedException {
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.awaitPingsSent     // Catch: java.lang.Throwable -> L12
            r2 = 1
            long r0 = r0 + r2
            r4.awaitPingsSent = r0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r4)
            r0 = 3
            r1 = 1330343787(0x4f4b6f6b, float:3.4130767E9)
            r2 = 0
            r4.writePing(r2, r0, r1)
            return
        L12:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    public final void writePing(boolean r2, int r3, int r4) {
            r1 = this;
            okhttp3.internal.http2.Http2Writer r0 = r1.writer     // Catch: java.io.IOException -> L6
            r0.ping(r2, r3, r4)     // Catch: java.io.IOException -> L6
            return
        L6:
            r2 = move-exception
            r1.failConnection(r2)
            return
    }

    public final void writePingAndAwaitPong() throws java.lang.InterruptedException {
            r0 = this;
            r0.writePing()
            r0.awaitPong()
            return
    }

    public final void writeSynReset$okhttp(int r2, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "statusCode"
            kotlin.jvm.internal.g0.p(r3, r0)
            okhttp3.internal.http2.Http2Writer r0 = r1.writer
            r0.rstStream(r2, r3)
            return
    }

    public final void writeSynResetLater$okhttp(int r10, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r11) {
            r9 = this;
            java.lang.String r0 = "errorCode"
            kotlin.jvm.internal.g0.p(r11, r0)
            okhttp3.internal.concurrent.TaskQueue r1 = r9.writerQueue
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r9.connectionName
            r0.append(r2)
            r2 = 91
            r0.append(r2)
            r0.append(r10)
            java.lang.String r2 = "] writeSynReset"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            okhttp3.internal.http2.e r6 = new okhttp3.internal.http2.e
            r6.<init>(r9, r10, r11)
            r7 = 6
            r8 = 0
            r3 = 0
            r5 = 0
            okhttp3.internal.concurrent.TaskQueue.execute$default(r1, r2, r3, r5, r6, r7, r8)
            return
    }

    public final void writeWindowUpdateLater$okhttp(int r9, long r10) {
            r8 = this;
            okhttp3.internal.concurrent.TaskQueue r0 = r8.writerQueue
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r8.connectionName
            r1.append(r2)
            r2 = 91
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = "] windowUpdate"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            okhttp3.internal.http2.c r5 = new okhttp3.internal.http2.c
            r5.<init>(r8, r9, r10)
            r6 = 6
            r7 = 0
            r2 = 0
            r4 = 0
            okhttp3.internal.concurrent.TaskQueue.execute$default(r0, r1, r2, r4, r5, r6, r7)
            return
    }
}
