package com.trello.rxlifecycle2.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum ActivityEvent extends java.lang.Enum<com.trello.rxlifecycle2.android.ActivityEvent> {
    private static final /* synthetic */ com.trello.rxlifecycle2.android.ActivityEvent[] $VALUES = null;
    public static final com.trello.rxlifecycle2.android.ActivityEvent CREATE = null;
    public static final com.trello.rxlifecycle2.android.ActivityEvent DESTROY = null;
    public static final com.trello.rxlifecycle2.android.ActivityEvent PAUSE = null;
    public static final com.trello.rxlifecycle2.android.ActivityEvent RESUME = null;
    public static final com.trello.rxlifecycle2.android.ActivityEvent START = null;
    public static final com.trello.rxlifecycle2.android.ActivityEvent STOP = null;

    static {
            com.trello.rxlifecycle2.android.ActivityEvent r0 = new com.trello.rxlifecycle2.android.ActivityEvent
            java.lang.String r1 = "CREATE"
            r2 = 0
            r0.<init>(r1, r2)
            com.trello.rxlifecycle2.android.ActivityEvent.CREATE = r0
            com.trello.rxlifecycle2.android.ActivityEvent r1 = new com.trello.rxlifecycle2.android.ActivityEvent
            java.lang.String r3 = "START"
            r4 = 1
            r1.<init>(r3, r4)
            com.trello.rxlifecycle2.android.ActivityEvent.START = r1
            com.trello.rxlifecycle2.android.ActivityEvent r3 = new com.trello.rxlifecycle2.android.ActivityEvent
            java.lang.String r5 = "RESUME"
            r6 = 2
            r3.<init>(r5, r6)
            com.trello.rxlifecycle2.android.ActivityEvent.RESUME = r3
            com.trello.rxlifecycle2.android.ActivityEvent r5 = new com.trello.rxlifecycle2.android.ActivityEvent
            java.lang.String r7 = "PAUSE"
            r8 = 3
            r5.<init>(r7, r8)
            com.trello.rxlifecycle2.android.ActivityEvent.PAUSE = r5
            com.trello.rxlifecycle2.android.ActivityEvent r7 = new com.trello.rxlifecycle2.android.ActivityEvent
            java.lang.String r9 = "STOP"
            r10 = 4
            r7.<init>(r9, r10)
            com.trello.rxlifecycle2.android.ActivityEvent.STOP = r7
            com.trello.rxlifecycle2.android.ActivityEvent r9 = new com.trello.rxlifecycle2.android.ActivityEvent
            java.lang.String r11 = "DESTROY"
            r12 = 5
            r9.<init>(r11, r12)
            com.trello.rxlifecycle2.android.ActivityEvent.DESTROY = r9
            r11 = 6
            com.trello.rxlifecycle2.android.ActivityEvent[] r11 = new com.trello.rxlifecycle2.android.ActivityEvent[r11]
            r11[r2] = r0
            r11[r4] = r1
            r11[r6] = r3
            r11[r8] = r5
            r11[r10] = r7
            r11[r12] = r9
            com.trello.rxlifecycle2.android.ActivityEvent.$VALUES = r11
            return
    }

    ActivityEvent(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.trello.rxlifecycle2.android.ActivityEvent valueOf(java.lang.String r1) {
            java.lang.Class<com.trello.rxlifecycle2.android.ActivityEvent> r0 = com.trello.rxlifecycle2.android.ActivityEvent.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.trello.rxlifecycle2.android.ActivityEvent r1 = (com.trello.rxlifecycle2.android.ActivityEvent) r1
            return r1
    }

    public static com.trello.rxlifecycle2.android.ActivityEvent[] values() {
            com.trello.rxlifecycle2.android.ActivityEvent[] r0 = com.trello.rxlifecycle2.android.ActivityEvent.$VALUES
            java.lang.Object r0 = r0.clone()
            com.trello.rxlifecycle2.android.ActivityEvent[] r0 = (com.trello.rxlifecycle2.android.ActivityEvent[]) r0
            return r0
    }
}
