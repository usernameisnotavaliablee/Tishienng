package io.netty.channel.kqueue;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class Native {
    static final short EVFILT_READ = 0;
    static final short EVFILT_SOCK = 0;
    static final short EVFILT_USER = 0;
    static final short EVFILT_WRITE = 0;
    static final short EV_ADD = 0;
    static final short EV_ADD_CLEAR_ENABLE = 0;
    static final short EV_CLEAR = 0;
    static final short EV_DELETE = 0;
    static final short EV_DELETE_DISABLE = 0;
    static final short EV_DISABLE = 0;
    static final short EV_ENABLE = 0;
    static final short EV_EOF = 0;
    static final short EV_ERROR = 0;
    static final int NOTE_CONNRESET = 0;
    static final int NOTE_DISCONNECTED = 0;
    static final int NOTE_RDHUP = 0;
    static final int NOTE_READCLOSED = 0;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;

    static {
            java.lang.Class<io.netty.channel.kqueue.Native> r0 = io.netty.channel.kqueue.Native.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.kqueue.Native.logger = r0
            sizeofKEvent()     // Catch: java.lang.UnsatisfiedLinkError -> Lc
            goto Lf
        Lc:
            loadNativeLibrary()
        Lf:
            io.netty.channel.unix.Socket.initialize()
            short r0 = io.netty.channel.kqueue.KQueueStaticallyReferencedJniMethods.evAdd()
            io.netty.channel.kqueue.Native.EV_ADD = r0
            short r1 = io.netty.channel.kqueue.KQueueStaticallyReferencedJniMethods.evEnable()
            io.netty.channel.kqueue.Native.EV_ENABLE = r1
            short r2 = io.netty.channel.kqueue.KQueueStaticallyReferencedJniMethods.evDisable()
            io.netty.channel.kqueue.Native.EV_DISABLE = r2
            short r3 = io.netty.channel.kqueue.KQueueStaticallyReferencedJniMethods.evDelete()
            io.netty.channel.kqueue.Native.EV_DELETE = r3
            short r4 = io.netty.channel.kqueue.KQueueStaticallyReferencedJniMethods.evClear()
            io.netty.channel.kqueue.Native.EV_CLEAR = r4
            short r5 = io.netty.channel.kqueue.KQueueStaticallyReferencedJniMethods.evError()
            io.netty.channel.kqueue.Native.EV_ERROR = r5
            short r5 = io.netty.channel.kqueue.KQueueStaticallyReferencedJniMethods.evEOF()
            io.netty.channel.kqueue.Native.EV_EOF = r5
            short r5 = io.netty.channel.kqueue.KQueueStaticallyReferencedJniMethods.noteReadClosed()
            io.netty.channel.kqueue.Native.NOTE_READCLOSED = r5
            short r6 = io.netty.channel.kqueue.KQueueStaticallyReferencedJniMethods.noteConnReset()
            io.netty.channel.kqueue.Native.NOTE_CONNRESET = r6
            short r7 = io.netty.channel.kqueue.KQueueStaticallyReferencedJniMethods.noteDisconnected()
            io.netty.channel.kqueue.Native.NOTE_DISCONNECTED = r7
            r5 = r5 | r6
            r5 = r5 | r7
            io.netty.channel.kqueue.Native.NOTE_RDHUP = r5
            r0 = r0 | r4
            r0 = r0 | r1
            short r0 = (short) r0
            io.netty.channel.kqueue.Native.EV_ADD_CLEAR_ENABLE = r0
            r0 = r3 | r2
            short r0 = (short) r0
            io.netty.channel.kqueue.Native.EV_DELETE_DISABLE = r0
            short r0 = io.netty.channel.kqueue.KQueueStaticallyReferencedJniMethods.evfiltRead()
            io.netty.channel.kqueue.Native.EVFILT_READ = r0
            short r0 = io.netty.channel.kqueue.KQueueStaticallyReferencedJniMethods.evfiltWrite()
            io.netty.channel.kqueue.Native.EVFILT_WRITE = r0
            short r0 = io.netty.channel.kqueue.KQueueStaticallyReferencedJniMethods.evfiltUser()
            io.netty.channel.kqueue.Native.EVFILT_USER = r0
            short r0 = io.netty.channel.kqueue.KQueueStaticallyReferencedJniMethods.evfiltSock()
            io.netty.channel.kqueue.Native.EVFILT_SOCK = r0
            return
    }

    private Native() {
            r0 = this;
            r0.<init>()
            return
    }

    static native int keventAddUserEvent(int r0, int r1);

    static native int keventTriggerUserEvent(int r0, int r1);

    private static native int keventWait(int r0, long r1, int r3, long r4, int r6, int r7, int r8);

    static int keventWait(int r9, io.netty.channel.kqueue.KQueueEventArray r10, io.netty.channel.kqueue.KQueueEventArray r11, int r12, int r13) throws java.io.IOException {
            long r1 = r10.memoryAddress()
            int r3 = r10.size()
            long r4 = r11.memoryAddress()
            int r6 = r11.capacity()
            r0 = r9
            r7 = r12
            r8 = r13
            int r9 = keventWait(r0, r1, r3, r4, r6, r7, r8)
            if (r9 < 0) goto L1a
            return r9
        L1a:
            java.lang.String r10 = "kevent"
            io.netty.channel.unix.Errors$NativeIoException r9 = io.netty.channel.unix.Errors.newIOException(r10, r9)
            throw r9
    }

    private static native int kqueueCreate();

    private static void loadNativeLibrary() {
            java.lang.String r0 = "os.name"
            java.lang.String r0 = io.netty.util.internal.SystemPropertyUtil.get(r0)
            java.util.Locale r1 = java.util.Locale.UK
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r0 = r0.trim()
            java.lang.String r1 = "mac"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L31
            java.lang.String r1 = "bsd"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L31
            java.lang.String r1 = "darwin"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Only supported on BSD"
            r0.<init>(r1)
            throw r0
        L31:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "netty_transport_native_kqueue"
            r0.append(r1)
            r2 = 95
            r0.append(r2)
            java.lang.String r2 = io.netty.util.internal.PlatformDependent.normalizedArch()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.Class<io.netty.channel.kqueue.Native> r2 = io.netty.channel.kqueue.Native.class
            java.lang.ClassLoader r2 = io.netty.util.internal.PlatformDependent.getClassLoader(r2)
            io.netty.util.internal.NativeLibraryLoader.load(r0, r2)     // Catch: java.lang.UnsatisfiedLinkError -> L55
            return
        L55:
            r3 = move-exception
            io.netty.util.internal.NativeLibraryLoader.load(r1, r2)     // Catch: java.lang.UnsatisfiedLinkError -> L61
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.channel.kqueue.Native.logger     // Catch: java.lang.UnsatisfiedLinkError -> L61
            java.lang.String r2 = "Failed to load {}"
            r1.debug(r2, r0, r3)     // Catch: java.lang.UnsatisfiedLinkError -> L61
            return
        L61:
            r0 = move-exception
            io.netty.util.internal.ThrowableUtil.addSuppressed(r3, r0)
            throw r3
    }

    static io.netty.channel.unix.FileDescriptor newKQueue() {
            io.netty.channel.unix.FileDescriptor r0 = new io.netty.channel.unix.FileDescriptor
            int r1 = kqueueCreate()
            r0.<init>(r1)
            return r0
    }

    static native int offsetofKEventFFlags();

    static native int offsetofKEventFilter();

    static native int offsetofKEventFlags();

    static native int offsetofKEventIdent();

    static native int offsetofKeventData();

    static native int sizeofKEvent();
}
