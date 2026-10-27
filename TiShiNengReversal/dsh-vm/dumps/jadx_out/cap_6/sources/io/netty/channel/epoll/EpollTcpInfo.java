package io.netty.channel.epoll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class EpollTcpInfo {
    final long[] info;

    public EpollTcpInfo() {
            r1 = this;
            r1.<init>()
            r0 = 32
            long[] r0 = new long[r0]
            r1.info = r0
            return
    }

    public long advmss() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 27
            r1 = r0[r1]
            return r1
    }

    public long ato() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 9
            r1 = r0[r1]
            return r1
    }

    public int backoff() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 4
            r1 = r0[r1]
            int r0 = (int) r1
            return r0
    }

    public int caState() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 1
            r1 = r0[r1]
            int r0 = (int) r1
            return r0
    }

    public long fackets() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 16
            r1 = r0[r1]
            return r1
    }

    public long lastAckRecv() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 20
            r1 = r0[r1]
            return r1
    }

    public long lastAckSent() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 18
            r1 = r0[r1]
            return r1
    }

    public long lastDataRecv() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 19
            r1 = r0[r1]
            return r1
    }

    public long lastDataSent() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 17
            r1 = r0[r1]
            return r1
    }

    public long lost() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 14
            r1 = r0[r1]
            return r1
    }

    public int options() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 5
            r1 = r0[r1]
            int r0 = (int) r1
            return r0
    }

    public long pmtu() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 21
            r1 = r0[r1]
            return r1
    }

    public int probes() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 3
            r1 = r0[r1]
            int r0 = (int) r1
            return r0
    }

    public long rcvMss() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 11
            r1 = r0[r1]
            return r1
    }

    public long rcvRtt() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 29
            r1 = r0[r1]
            return r1
    }

    public long rcvSpace() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 30
            r1 = r0[r1]
            return r1
    }

    public long rcvSsthresh() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 22
            r1 = r0[r1]
            return r1
    }

    public int rcvWscale() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 7
            r1 = r0[r1]
            int r0 = (int) r1
            return r0
    }

    public long reordering() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 28
            r1 = r0[r1]
            return r1
    }

    public long retrans() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 15
            r1 = r0[r1]
            return r1
    }

    public int retransmits() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 2
            r1 = r0[r1]
            int r0 = (int) r1
            return r0
    }

    public long rto() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 8
            r1 = r0[r1]
            return r1
    }

    public long rtt() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 23
            r1 = r0[r1]
            return r1
    }

    public long rttvar() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 24
            r1 = r0[r1]
            return r1
    }

    public long sacked() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 13
            r1 = r0[r1]
            return r1
    }

    public long sndCwnd() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 26
            r1 = r0[r1]
            return r1
    }

    public long sndMss() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 10
            r1 = r0[r1]
            return r1
    }

    public long sndSsthresh() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 25
            r1 = r0[r1]
            return r1
    }

    public int sndWscale() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 6
            r1 = r0[r1]
            int r0 = (int) r1
            return r0
    }

    public int state() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 0
            r1 = r0[r1]
            int r0 = (int) r1
            return r0
    }

    public long totalRetrans() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 31
            r1 = r0[r1]
            return r1
    }

    public long unacked() {
            r3 = this;
            long[] r0 = r3.info
            r1 = 12
            r1 = r0[r1]
            return r1
    }
}
