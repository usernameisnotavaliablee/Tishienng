package rx.internal.subscriptions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public enum Unsubscribed extends java.lang.Enum<rx.internal.subscriptions.Unsubscribed> implements rx.m {
    private static final /* synthetic */ rx.internal.subscriptions.Unsubscribed[] $VALUES = null;
    public static final rx.internal.subscriptions.Unsubscribed INSTANCE = null;

    static {
            rx.internal.subscriptions.Unsubscribed r0 = new rx.internal.subscriptions.Unsubscribed
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            rx.internal.subscriptions.Unsubscribed.INSTANCE = r0
            r1 = 1
            rx.internal.subscriptions.Unsubscribed[] r1 = new rx.internal.subscriptions.Unsubscribed[r1]
            r1[r2] = r0
            rx.internal.subscriptions.Unsubscribed.$VALUES = r1
            return
    }

    Unsubscribed(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static rx.internal.subscriptions.Unsubscribed valueOf(java.lang.String r1) {
            java.lang.Class<rx.internal.subscriptions.Unsubscribed> r0 = rx.internal.subscriptions.Unsubscribed.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            rx.internal.subscriptions.Unsubscribed r1 = (rx.internal.subscriptions.Unsubscribed) r1
            return r1
    }

    public static rx.internal.subscriptions.Unsubscribed[] values() {
            rx.internal.subscriptions.Unsubscribed[] r0 = rx.internal.subscriptions.Unsubscribed.$VALUES
            java.lang.Object r0 = r0.clone()
            rx.internal.subscriptions.Unsubscribed[] r0 = (rx.internal.subscriptions.Unsubscribed[]) r0
            return r0
    }

    public boolean isUnsubscribed() {
            r1 = this;
            r0 = 1
            return r0
    }

    public void unsubscribe() {
            r0 = this;
            return
    }
}
