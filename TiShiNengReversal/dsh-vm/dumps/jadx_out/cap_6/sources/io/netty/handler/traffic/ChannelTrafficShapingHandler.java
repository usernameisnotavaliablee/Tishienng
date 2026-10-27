package io.netty.handler.traffic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ChannelTrafficShapingHandler extends io.netty.handler.traffic.AbstractTrafficShapingHandler {
    private final java.util.ArrayDeque<io.netty.handler.traffic.ChannelTrafficShapingHandler.ToSend> messagesQueue;
    private long queueSize;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ToSend {
        final io.netty.channel.ChannelPromise promise;
        final long relativeTimeAction;
        final java.lang.Object toSend;

        private ToSend(long r1, java.lang.Object r3, io.netty.channel.ChannelPromise r4) {
                r0 = this;
                r0.<init>()
                r0.relativeTimeAction = r1
                r0.toSend = r3
                r0.promise = r4
                return
        }

        /* synthetic */ ToSend(long r1, java.lang.Object r3, io.netty.channel.ChannelPromise r4, io.netty.handler.traffic.ChannelTrafficShapingHandler.AnonymousClass1 r5) {
                r0 = this;
                r0.<init>(r1, r3, r4)
                return
        }
    }

    public ChannelTrafficShapingHandler(long r1) {
            r0 = this;
            r0.<init>(r1)
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.messagesQueue = r1
            return
    }

    public ChannelTrafficShapingHandler(long r1, long r3) {
            r0 = this;
            r0.<init>(r1, r3)
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.messagesQueue = r1
            return
    }

    public ChannelTrafficShapingHandler(long r1, long r3, long r5) {
            r0 = this;
            r0.<init>(r1, r3, r5)
            r1 = r0
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.messagesQueue = r2
            return
    }

    public ChannelTrafficShapingHandler(long r1, long r3, long r5, long r7) {
            r0 = this;
            r0.<init>(r1, r3, r5, r7)
            r1 = r0
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.messagesQueue = r2
            return
    }

    static /* synthetic */ void access$100(io.netty.handler.traffic.ChannelTrafficShapingHandler r0, io.netty.channel.ChannelHandlerContext r1, long r2) {
            r0.sendAllValid(r1, r2)
            return
    }

    private void sendAllValid(io.netty.channel.ChannelHandlerContext r6, long r7) {
            r5 = this;
            monitor-enter(r5)
            java.util.ArrayDeque<io.netty.handler.traffic.ChannelTrafficShapingHandler$ToSend> r0 = r5.messagesQueue     // Catch: java.lang.Throwable -> L31
            java.lang.Object r0 = r0.pollFirst()     // Catch: java.lang.Throwable -> L31
            io.netty.handler.traffic.ChannelTrafficShapingHandler$ToSend r0 = (io.netty.handler.traffic.ChannelTrafficShapingHandler.ToSend) r0     // Catch: java.lang.Throwable -> L31
        L9:
            if (r0 == 0) goto L38
            long r1 = r0.relativeTimeAction     // Catch: java.lang.Throwable -> L31
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 > 0) goto L33
            java.lang.Object r1 = r0.toSend     // Catch: java.lang.Throwable -> L31
            long r1 = r5.calculateSize(r1)     // Catch: java.lang.Throwable -> L31
            io.netty.handler.traffic.TrafficCounter r3 = r5.trafficCounter     // Catch: java.lang.Throwable -> L31
            r3.bytesRealWriteFlowControl(r1)     // Catch: java.lang.Throwable -> L31
            long r3 = r5.queueSize     // Catch: java.lang.Throwable -> L31
            long r3 = r3 - r1
            r5.queueSize = r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r1 = r0.toSend     // Catch: java.lang.Throwable -> L31
            io.netty.channel.ChannelPromise r0 = r0.promise     // Catch: java.lang.Throwable -> L31
            r6.write(r1, r0)     // Catch: java.lang.Throwable -> L31
            java.util.ArrayDeque<io.netty.handler.traffic.ChannelTrafficShapingHandler$ToSend> r0 = r5.messagesQueue     // Catch: java.lang.Throwable -> L31
            java.lang.Object r0 = r0.pollFirst()     // Catch: java.lang.Throwable -> L31
            io.netty.handler.traffic.ChannelTrafficShapingHandler$ToSend r0 = (io.netty.handler.traffic.ChannelTrafficShapingHandler.ToSend) r0     // Catch: java.lang.Throwable -> L31
            goto L9
        L31:
            r6 = move-exception
            goto L48
        L33:
            java.util.ArrayDeque<io.netty.handler.traffic.ChannelTrafficShapingHandler$ToSend> r7 = r5.messagesQueue     // Catch: java.lang.Throwable -> L31
            r7.addFirst(r0)     // Catch: java.lang.Throwable -> L31
        L38:
            java.util.ArrayDeque<io.netty.handler.traffic.ChannelTrafficShapingHandler$ToSend> r7 = r5.messagesQueue     // Catch: java.lang.Throwable -> L31
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L31
            if (r7 == 0) goto L43
            r5.releaseWriteSuspended(r6)     // Catch: java.lang.Throwable -> L31
        L43:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L31
            r6.flush()
            return
        L48:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L31
            throw r6
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerAdded(io.netty.channel.ChannelHandlerContext r7) throws java.lang.Exception {
            r6 = this;
            io.netty.handler.traffic.TrafficCounter r0 = new io.netty.handler.traffic.TrafficCounter
            io.netty.util.concurrent.EventExecutor r2 = r7.executor()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "ChannelTC"
            r1.append(r3)
            io.netty.channel.Channel r3 = r7.channel()
            int r3 = r3.hashCode()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            long r4 = r6.checkInterval
            r1 = r6
            r0.<init>(r1, r2, r3, r4)
            r6.setTrafficCounter(r0)
            r0.start()
            super.handlerAdded(r7)
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerRemoved(io.netty.channel.ChannelHandlerContext r7) throws java.lang.Exception {
            r6 = this;
            io.netty.handler.traffic.TrafficCounter r0 = r6.trafficCounter
            r0.stop()
            monitor-enter(r6)
            io.netty.channel.Channel r0 = r7.channel()     // Catch: java.lang.Throwable -> L3a
            boolean r0 = r0.isActive()     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L3c
            java.util.ArrayDeque<io.netty.handler.traffic.ChannelTrafficShapingHandler$ToSend> r0 = r6.messagesQueue     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3a
        L16:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3a
            io.netty.handler.traffic.ChannelTrafficShapingHandler$ToSend r1 = (io.netty.handler.traffic.ChannelTrafficShapingHandler.ToSend) r1     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r2 = r1.toSend     // Catch: java.lang.Throwable -> L3a
            long r2 = r6.calculateSize(r2)     // Catch: java.lang.Throwable -> L3a
            io.netty.handler.traffic.TrafficCounter r4 = r6.trafficCounter     // Catch: java.lang.Throwable -> L3a
            r4.bytesRealWriteFlowControl(r2)     // Catch: java.lang.Throwable -> L3a
            long r4 = r6.queueSize     // Catch: java.lang.Throwable -> L3a
            long r4 = r4 - r2
            r6.queueSize = r4     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r2 = r1.toSend     // Catch: java.lang.Throwable -> L3a
            io.netty.channel.ChannelPromise r1 = r1.promise     // Catch: java.lang.Throwable -> L3a
            r7.write(r2, r1)     // Catch: java.lang.Throwable -> L3a
            goto L16
        L3a:
            r7 = move-exception
            goto L6a
        L3c:
            java.util.ArrayDeque<io.netty.handler.traffic.ChannelTrafficShapingHandler$ToSend> r0 = r6.messagesQueue     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3a
        L42:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3a
            io.netty.handler.traffic.ChannelTrafficShapingHandler$ToSend r1 = (io.netty.handler.traffic.ChannelTrafficShapingHandler.ToSend) r1     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r1 = r1.toSend     // Catch: java.lang.Throwable -> L3a
            boolean r2 = r1 instanceof io.netty.buffer.ByteBuf     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L42
            io.netty.buffer.ByteBuf r1 = (io.netty.buffer.ByteBuf) r1     // Catch: java.lang.Throwable -> L3a
            r1.release()     // Catch: java.lang.Throwable -> L3a
            goto L42
        L5a:
            java.util.ArrayDeque<io.netty.handler.traffic.ChannelTrafficShapingHandler$ToSend> r0 = r6.messagesQueue     // Catch: java.lang.Throwable -> L3a
            r0.clear()     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L3a
            r6.releaseWriteSuspended(r7)
            r6.releaseReadSuspended(r7)
            super.handlerRemoved(r7)
            return
        L6a:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L3a
            throw r7
    }

    public long queueSize() {
            r2 = this;
            long r0 = r2.queueSize
            return r0
    }

    @Override // io.netty.handler.traffic.AbstractTrafficShapingHandler
    void submitWrite(io.netty.channel.ChannelHandlerContext r7, java.lang.Object r8, long r9, long r11, long r13, io.netty.channel.ChannelPromise r15) {
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 != 0) goto L1e
            java.util.ArrayDeque<io.netty.handler.traffic.ChannelTrafficShapingHandler$ToSend> r0 = r6.messagesQueue     // Catch: java.lang.Throwable -> L19
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1e
            io.netty.handler.traffic.TrafficCounter r11 = r6.trafficCounter     // Catch: java.lang.Throwable -> L19
            r11.bytesRealWriteFlowControl(r9)     // Catch: java.lang.Throwable -> L19
            r7.write(r8, r15)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L19
            return
        L19:
            r0 = move-exception
            r7 = r0
            r8 = r7
            r7 = r6
            goto L51
        L1e:
            io.netty.handler.traffic.ChannelTrafficShapingHandler$ToSend r0 = new io.netty.handler.traffic.ChannelTrafficShapingHandler$ToSend     // Catch: java.lang.Throwable -> L4e
            long r1 = r11 + r13
            r5 = 0
            r3 = r8
            r4 = r15
            r0.<init>(r1, r3, r4, r5)     // Catch: java.lang.Throwable -> L4e
            java.util.ArrayDeque<io.netty.handler.traffic.ChannelTrafficShapingHandler$ToSend> r8 = r6.messagesQueue     // Catch: java.lang.Throwable -> L4e
            r8.addLast(r0)     // Catch: java.lang.Throwable -> L4e
            long r13 = r6.queueSize     // Catch: java.lang.Throwable -> L4e
            long r13 = r13 + r9
            r6.queueSize = r13     // Catch: java.lang.Throwable -> L4e
            r8 = r7
            r9 = r11
            r11 = r13
            r7 = r6
            r7.checkWriteSuspend(r8, r9, r11)     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L4b
            long r11 = r0.relativeTimeAction
            io.netty.util.concurrent.EventExecutor r13 = r8.executor()
            io.netty.handler.traffic.ChannelTrafficShapingHandler$1 r14 = new io.netty.handler.traffic.ChannelTrafficShapingHandler$1
            r14.<init>(r6, r8, r11)
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            r13.schedule(r14, r9, r8)
            return
        L4b:
            r0 = move-exception
        L4c:
            r8 = r0
            goto L51
        L4e:
            r0 = move-exception
            r7 = r6
            goto L4c
        L51:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L4b
            throw r8
    }
}
