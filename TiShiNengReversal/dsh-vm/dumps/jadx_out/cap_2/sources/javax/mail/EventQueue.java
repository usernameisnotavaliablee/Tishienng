package javax.mail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class EventQueue implements java.lang.Runnable {
    private javax.mail.EventQueue.QueueElement head;
    private java.lang.Thread qThread;
    private javax.mail.EventQueue.QueueElement tail;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class QueueElement {
        javax.mail.event.MailEvent event;
        javax.mail.EventQueue.QueueElement next;
        javax.mail.EventQueue.QueueElement prev;
        java.util.Vector vector;

        QueueElement(javax.mail.event.MailEvent r2, java.util.Vector r3) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.next = r0
                r1.prev = r0
                r1.event = r2
                r1.vector = r3
                return
        }
    }

    public EventQueue() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.head = r0
            r2.tail = r0
            java.lang.Thread r0 = new java.lang.Thread
            java.lang.String r1 = "JavaMail-EventQueue"
            r0.<init>(r2, r1)
            r2.qThread = r0
            r1 = 1
            r0.setDaemon(r1)
            java.lang.Thread r0 = r2.qThread
            r0.start()
            return
    }

    private synchronized javax.mail.EventQueue.QueueElement dequeue() throws java.lang.InterruptedException {
            r3 = this;
            monitor-enter(r3)
        L1:
            javax.mail.EventQueue$QueueElement r0 = r3.tail     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L19
            javax.mail.EventQueue$QueueElement r1 = r0.prev     // Catch: java.lang.Throwable -> Lf
            r3.tail = r1     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            if (r1 != 0) goto L11
            r3.head = r2     // Catch: java.lang.Throwable -> Lf
            goto L13
        Lf:
            r0 = move-exception
            goto L1d
        L11:
            r1.next = r2     // Catch: java.lang.Throwable -> Lf
        L13:
            r0.next = r2     // Catch: java.lang.Throwable -> Lf
            r0.prev = r2     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r3)
            return r0
        L19:
            r3.wait()     // Catch: java.lang.Throwable -> Lf
            goto L1
        L1d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    public synchronized void enqueue(javax.mail.event.MailEvent r2, java.util.Vector r3) {
            r1 = this;
            monitor-enter(r1)
            javax.mail.EventQueue$QueueElement r0 = new javax.mail.EventQueue$QueueElement     // Catch: java.lang.Throwable -> Lf
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lf
            javax.mail.EventQueue$QueueElement r2 = r1.head     // Catch: java.lang.Throwable -> Lf
            if (r2 != 0) goto L11
            r1.head = r0     // Catch: java.lang.Throwable -> Lf
            r1.tail = r0     // Catch: java.lang.Throwable -> Lf
            goto L17
        Lf:
            r2 = move-exception
            goto L1c
        L11:
            r0.next = r2     // Catch: java.lang.Throwable -> Lf
            r2.prev = r0     // Catch: java.lang.Throwable -> Lf
            r1.head = r0     // Catch: java.lang.Throwable -> Lf
        L17:
            r1.notifyAll()     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    @Override // java.lang.Runnable
    public void run() {
            r4 = this;
        L0:
            javax.mail.EventQueue$QueueElement r0 = r4.dequeue()     // Catch: java.lang.InterruptedException -> L24
            if (r0 != 0) goto L7
            goto L24
        L7:
            javax.mail.event.MailEvent r1 = r0.event     // Catch: java.lang.InterruptedException -> L24
            java.util.Vector r0 = r0.vector     // Catch: java.lang.InterruptedException -> L24
            r2 = 0
        Lc:
            int r3 = r0.size()     // Catch: java.lang.InterruptedException -> L24
            if (r2 < r3) goto L13
            goto L0
        L13:
            java.lang.Object r3 = r0.elementAt(r2)     // Catch: java.lang.Throwable -> L1b
            r1.dispatch(r3)     // Catch: java.lang.Throwable -> L1b
            goto L21
        L1b:
            r3 = move-exception
            boolean r3 = r3 instanceof java.lang.InterruptedException     // Catch: java.lang.InterruptedException -> L24
            if (r3 == 0) goto L21
            goto L24
        L21:
            int r2 = r2 + 1
            goto Lc
        L24:
            return
    }

    void stop() {
            r1 = this;
            java.lang.Thread r0 = r1.qThread
            if (r0 == 0) goto La
            r0.interrupt()
            r0 = 0
            r1.qThread = r0
        La:
            return
    }
}
