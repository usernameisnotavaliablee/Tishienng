package com.bykv.vk.component.ttvideo.player;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class MediaFormat {
    public static final java.lang.String KEY_AUDIO = "audio";
    public static final java.lang.String KEY_BIT_RATE = "bitrate";
    public static final java.lang.String KEY_CHANNEL_COUNT = "channel-count";
    public static final java.lang.String KEY_HEIGHT = "height";
    public static final java.lang.String KEY_LANGUAGE = "language";
    public static final java.lang.String KEY_SAMPLE_RATE = "sample-rate";
    public static final java.lang.String KEY_SUBTITLE = "subtitle";
    public static final java.lang.String KEY_TRACK_ID = "track-id";
    public static final java.lang.String KEY_VIDEO = "video";
    public static final java.lang.String KEY_WIDTH = "width";
    private java.util.Map<java.lang.String, java.lang.Object> mMap;

    public MediaFormat() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mMap = r0
            return
    }

    public MediaFormat(java.util.Map<java.lang.String, java.lang.Object> r1) {
            r0 = this;
            r0.<init>()
            r0.mMap = r1
            return
    }

    public static final com.bykv.vk.component.ttvideo.player.MediaFormat createAudioFormat(int r2, int r3, int r4) {
            com.bykv.vk.component.ttvideo.player.MediaFormat r0 = new com.bykv.vk.component.ttvideo.player.MediaFormat
            r0.<init>()
            java.lang.String r1 = "track-id"
            r0.setInteger(r1, r2)
            java.lang.String r2 = "sample-rate"
            r0.setInteger(r2, r3)
            java.lang.String r2 = "channel-count"
            r0.setInteger(r2, r4)
            return r0
    }

    public static final com.bykv.vk.component.ttvideo.player.MediaFormat createAudioFormat(android.media.MediaFormat r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.lang.String r0 = "track-id"
            int r0 = r3.getInteger(r0)
            java.lang.String r1 = "sample-rate"
            int r1 = r3.getInteger(r1)
            java.lang.String r2 = "channel-count"
            int r3 = r3.getInteger(r2)
            com.bykv.vk.component.ttvideo.player.MediaFormat r3 = createAudioFormat(r0, r1, r3)
            return r3
    }

    public static final com.bykv.vk.component.ttvideo.player.MediaFormat createAudioFormat(org.json.JSONObject r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.lang.String r0 = "track-id"
            int r0 = r3.optInt(r0)
            java.lang.String r1 = "sample-rate"
            int r1 = r3.optInt(r1)
            java.lang.String r2 = "channel-count"
            int r3 = r3.optInt(r2)
            com.bykv.vk.component.ttvideo.player.MediaFormat r3 = createAudioFormat(r0, r1, r3)
            return r3
    }

    public static final com.bykv.vk.component.ttvideo.player.MediaFormat createSubtitleFormat(int r2, java.lang.String r3) {
            com.bykv.vk.component.ttvideo.player.MediaFormat r0 = new com.bykv.vk.component.ttvideo.player.MediaFormat
            r0.<init>()
            java.lang.String r1 = "track-id"
            r0.setInteger(r1, r2)
            java.lang.String r2 = "language"
            r0.setString(r2, r3)
            return r0
    }

    public static final com.bykv.vk.component.ttvideo.player.MediaFormat createSubtitleFormat(android.media.MediaFormat r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "track-id"
            int r0 = r2.getInteger(r0)
            java.lang.String r1 = "language"
            java.lang.String r2 = r2.getString(r1)
            com.bykv.vk.component.ttvideo.player.MediaFormat r2 = createSubtitleFormat(r0, r2)
            return r2
    }

    public static final com.bykv.vk.component.ttvideo.player.MediaFormat createSubtitleFormat(org.json.JSONObject r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "track-id"
            int r0 = r2.optInt(r0)
            java.lang.String r1 = "language"
            java.lang.String r2 = r2.optString(r1)
            com.bykv.vk.component.ttvideo.player.MediaFormat r2 = createSubtitleFormat(r0, r2)
            return r2
    }

    public static final com.bykv.vk.component.ttvideo.player.MediaFormat createVideoFormat(int r2, int r3, int r4, int r5) {
            com.bykv.vk.component.ttvideo.player.MediaFormat r0 = new com.bykv.vk.component.ttvideo.player.MediaFormat
            r0.<init>()
            java.lang.String r1 = "track-id"
            r0.setInteger(r1, r2)
            java.lang.String r2 = "width"
            r0.setInteger(r2, r3)
            java.lang.String r2 = "height"
            r0.setInteger(r2, r4)
            java.lang.String r2 = "bitrate"
            r0.setInteger(r2, r5)
            return r0
    }

    public static final com.bykv.vk.component.ttvideo.player.MediaFormat createVideoFormat(android.media.MediaFormat r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            java.lang.String r0 = "track-id"
            int r0 = r4.getInteger(r0)
            java.lang.String r1 = "width"
            int r1 = r4.getInteger(r1)
            java.lang.String r2 = "height"
            int r2 = r4.getInteger(r2)
            java.lang.String r3 = "bitrate"
            int r4 = r4.getInteger(r3)
            com.bykv.vk.component.ttvideo.player.MediaFormat r4 = createVideoFormat(r0, r1, r2, r4)
            return r4
    }

    public static final com.bykv.vk.component.ttvideo.player.MediaFormat createVideoFormat(org.json.JSONObject r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            java.lang.String r0 = "track-id"
            int r0 = r4.optInt(r0)
            java.lang.String r1 = "width"
            int r1 = r4.optInt(r1)
            java.lang.String r2 = "height"
            int r2 = r4.optInt(r2)
            java.lang.String r3 = "bitrate"
            int r4 = r4.optInt(r3)
            com.bykv.vk.component.ttvideo.player.MediaFormat r4 = createVideoFormat(r0, r1, r2, r4)
            return r4
    }

    public final float getFloat(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mMap
            java.lang.Object r2 = r0.get(r2)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            return r2
    }

    public final int getInteger(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mMap
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    public final long getLong(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.mMap
            java.lang.Object r3 = r0.get(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            long r0 = r3.longValue()
            return r0
    }

    public final java.lang.String getString(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mMap
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    public java.util.Map<java.lang.String, java.lang.Object> getValues() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mMap
            return r0
    }

    public final void setFloat(java.lang.String r2, float r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mMap
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0.put(r2, r3)
            return
    }

    public final void setInteger(java.lang.String r2, int r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mMap
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r2, r3)
            return
    }

    public final void setLong(java.lang.String r2, long r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mMap
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.put(r2, r3)
            return
    }

    public final void setString(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mMap
            r0.put(r2, r3)
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mMap
            java.lang.String r0 = r0.toString()
            return r0
    }
}
