package com.bytedance.android.live.base.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface IEventListener {

    public static class Event {
        public static final java.lang.String KEY_ENTER_FROM_TOB = "enter_from_tob";
        public static final java.lang.String KEY_OPEN_ROOM_ID = "open_room_id";
        public static final java.lang.String KEY_SEC_ROOM_ID = "sec_room_id";
        public static final int TYPE_COMMENT = 4;
        public static final int TYPE_ENTER = 1;
        public static final int TYPE_EXIT = 2;
        public static final int TYPE_FOLLOW = 3;
        public static final int TYPE_LIVE_CHANNEL_ITEM_DURATION = 8;
        public static final int TYPE_ORDER = 5;
        public static final int TYPE_ORDER_PAYMENT_SUCCESS = 7;
        public static final int TYPE_ORDER_PAYMENT_SUCCESS_PAGE_SHOW = 6;
        public static final int TYPE_UNKNOWN = 0;
        public java.util.HashMap<java.lang.String, java.lang.String> extra;
        public long time;
        public int type;

        public Event() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.extra = r0
                return
        }

        public Event(int r2, long r3) {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.extra = r0
                r1.type = r2
                r1.time = r3
                return
        }
    }

    public static class TypeEvent {
        public static final int TYPE_ACTIVITY_FINISH_BY_BACKGROUND_AND_SCREEN = 1000;

        public TypeEvent() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    void onEvent(com.bytedance.android.live.base.api.IEventListener.Event r1);
}
