package com.bykv.vk.component.ttvideo.player;

@com.bykv.vk.component.ttvideo.player.JNINamespace("PLAYER")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SidxListObject extends com.bykv.vk.component.ttvideo.player.NativeObject {
    private long mBitrate;
    private int mEndIndex;
    private java.lang.String mFileId;
    private java.util.List<com.bykv.vk.component.ttvideo.player.SidxListObject.SidxItem> mItems;
    private int mMediaType;
    private int mStartIndex;
    private int mTotalNum;

    public static class SidxItem {
        private long mDuration;
        private int mIndex;
        private long mOffset;
        private long mSize;
        private long mTimestamp;

        public SidxItem(int r1, long r2, long r4, long r6, long r8) {
                r0 = this;
                r0.<init>()
                r0.mIndex = r1
                r0.mOffset = r2
                r0.mTimestamp = r4
                r0.mDuration = r6
                r0.mSize = r8
                return
        }

        public long getDuration() {
                r2 = this;
                long r0 = r2.mDuration
                return r0
        }

        public int getIndex() {
                r1 = this;
                int r0 = r1.mIndex
                return r0
        }

        public long getOffset() {
                r2 = this;
                long r0 = r2.mOffset
                return r0
        }

        public long getSize() {
                r2 = this;
                long r0 = r2.mSize
                return r0
        }

        public long getTimestamp() {
                r2 = this;
                long r0 = r2.mTimestamp
                return r0
        }
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public SidxListObject(int r1, int r2, int r3, int r4, long r5, java.lang.String r7) {
            r0 = this;
            r0.<init>()
            r0.mMediaType = r1
            r0.mTotalNum = r2
            r0.mStartIndex = r3
            r0.mEndIndex = r4
            r0.mBitrate = r5
            r0.mFileId = r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.mItems = r1
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public void addItem(int r12, long r13, long r15, long r17, long r19) {
            r11 = this;
            java.util.List<com.bykv.vk.component.ttvideo.player.SidxListObject$SidxItem> r0 = r11.mItems
            com.bykv.vk.component.ttvideo.player.SidxListObject$SidxItem r1 = new com.bykv.vk.component.ttvideo.player.SidxListObject$SidxItem
            r2 = r12
            r3 = r13
            r5 = r15
            r7 = r17
            r9 = r19
            r1.<init>(r2, r3, r5, r7, r9)
            r0.add(r1)
            return
    }

    public long getBitrate() {
            r2 = this;
            long r0 = r2.mBitrate
            return r0
    }

    public int getEndIndex() {
            r1 = this;
            int r0 = r1.mEndIndex
            return r0
    }

    public java.lang.String getFileId() {
            r1 = this;
            java.lang.String r0 = r1.mFileId
            return r0
    }

    public com.bykv.vk.component.ttvideo.player.SidxListObject.SidxItem getItem(int r2) {
            r1 = this;
            if (r2 < 0) goto L13
            java.util.List<com.bykv.vk.component.ttvideo.player.SidxListObject$SidxItem> r0 = r1.mItems
            int r0 = r0.size()
            if (r2 >= r0) goto L13
            java.util.List<com.bykv.vk.component.ttvideo.player.SidxListObject$SidxItem> r0 = r1.mItems
            java.lang.Object r2 = r0.get(r2)
            com.bykv.vk.component.ttvideo.player.SidxListObject$SidxItem r2 = (com.bykv.vk.component.ttvideo.player.SidxListObject.SidxItem) r2
            return r2
        L13:
            r2 = 0
            return r2
    }

    public int getMediaType() {
            r1 = this;
            int r0 = r1.mMediaType
            return r0
    }

    public int getStartIndex() {
            r1 = this;
            int r0 = r1.mStartIndex
            return r0
    }

    public int getTotalNum() {
            r1 = this;
            int r0 = r1.mTotalNum
            return r0
    }
}
