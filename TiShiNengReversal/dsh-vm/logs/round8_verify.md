# round8_verify — Phase 3 验证 2026-08-15 04:23:13 +0800

## 1. 重哈希比对（14 cap + 8 输入，与 round8_manifest_sha256.txt 比对）
比对: 19/19 一致

## 2. probe 重跑（本轮涉及 cap: 0,1,2,3,5,6,7,9）
cap_0: [header] class_defs_size=4  class_defs_off=0x29bc
cap_1: [header] class_defs_size=7318  class_defs_off=0x1061e0
cap_2: [header] class_defs_size=6766  class_defs_off=0xcba9c
cap_3: [header] class_defs_size=3029  class_defs_off=0x5d778
cap_5: [header] class_defs_size=7446  class_defs_off=0xf238c
cap_6: [header] class_defs_size=5501  class_defs_off=0xdbe0c
cap_7: [header] class_defs_size=6228  class_defs_off=0xcfdbc
cap_9: [header] class_defs_size=7356  class_defs_off=0xe3268

## 3. jadx 输出抽查（关键类名 rg）
-- cap_1 顶级包:
dsh-vm/dumps/jadx_out/cap_1/sources
androidx
androidx/transition
androidx/asynclayoutinflater
androidx/tracing
androidx/collection
androidx/exifinterface
androidx/room
-- cap_9 顶级包:
dsh-vm/dumps/jadx_out/cap_9/sources
u0
v0
okio
okio/internal
b2
g1
a2
-- cap_0 StubApp 存在:
dsh-vm/dumps/jadx_out/cap_0/sources/com/stub/StubApp.java
