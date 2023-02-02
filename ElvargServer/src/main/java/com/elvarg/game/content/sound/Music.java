package com.elvarg.game.content.sound;

import kotlin._Assertions;

import java.util.Arrays;
import java.util.Optional;

public enum Music {
    ADVENTURE(12854, 177,"adventure"),
    AL_KHARID_1(13105,50,"al kharid"),
    AL_KHARID_2(13,50,"al kharid"),
    ALONE(12086, 102,"alone"),
    ALONE_2(10390, 102,	"alone"),
    AMBIENT_JUNGLE(10795, 90,"ambient jungle"),
    AMBIENT_JUNGLE_2(11310, 90,	"ambient jungle"),
    ARABIAN(13106, 36,	"arabian"),
    ANYWHERE(10795, 305,"anywhere"),
    ARABIQUE(11417, 19,	"arabique"),
    ARMY_OF_DARKNESS(12088, 160,"army of darkness"),
    ARRIVAL(11572,186,"arrival"),
    ARTISTRY(8010, 247,"artistry"),
    ATTENTION(11825, 180,"attention"),
    AYE_CAR_RUM_BA(8527,497,"aye car rum ba"),
    AZTEC(11157,248,"aztec"),
    BACKGROUND_1(11060, 324,"background"),
    BACKGROUND_2(11316, 324,"background"),
    BACKGROUND_3(7758,324,"background"),
    BALLAD_OF_ENCHANTMENT(10290, 152,"ballad of enchantment"),
    BANDIT_CAMP(12590, 263,"bandit camp"),
    BARBARIANISM(12441, 141,"barbarianism"),
    BARKING_MAD(14234, 345,"barking mad"),
    BAROQUE(10547,99,"baroque"),
    BEYOND(11418, 100,"beyond"),
    BEYOND_2(11419,100,"beyond"),
    BEYOND_3(11675,100,	"beyond"),
    BIG_CHORDS(10032,83,"big chords"),
    BLISTERING_BARNACLES(8528, 498,	"blistering barnacles"),
    BODY_PARTS(13979,342, "body parts"),
    BODY_PARTS_2(14235,342, "body parts"),
    BONE_DANCE(13619,154, "bone dance"),
    BONE_DRY(12946,266, "bone dry"),
    BONE_DRY_2(13202,266, "bone dry"),
    BOOK_OF_SPELLS(12593,64, "book of spells"),
    BORDERLAND(10809,291, "borderland"),
    BORDERLAND_2(10810,291, "borderland"),
    BREEZE(9010,132, "breeze"),
    BUBBLE_AND_SQUAD(7753,489, "bubble and squad"),
    CABIN_FEVER(7243,545, "cabin fever"),
    CAMELOT(11062,104, "camelot"),
    CAMELOT_2(11063,104, "camelot"),
    CASTLEWARS(9520,314, "castlewars"),
    CATCH_ME_IF_YOU_CAN(10646,481, "catch me if you can"),
    CAVE_BACKGROUND(12184,325, "cave background"),
    CAVE_BACKGROUND_2(11929,325, "cave background"),
    CAVE_BACKGROUND_3(12185,325, "cave background"),
    CAVE_OF_BEASTS(11165,357, "cave of beasts"),
    CAVE_OF_THE_GOBLINS(12693,389, "cave of the goblins"),
    CAVE_OF_THE_GOBLINS2(12949,389, "cave of the goblins"),
    CAVERN(12193,68, "cavern"),
    CAVERN_2(10388,68, "cavern"),
    CELLAR_SONG(12697,330, "cellar song"),
    CHAIN_OF_COMMANDS(10648,63, "chain of commands"),
    CHAIN_OF_COMMANDS_2(10651,63, "chain of commands"),
    CHAIN_OF_COMMANDS_3(10905,63, "chain of commands"),
    CHAMBER(10821,282, "chamber"),
    CHAMBER_2(11078,282, "chamber"),
    CHICKENED_OUT(9796,575, "chickened out"),
    CHOMPYHUNT(10542,71, "chompyhunt"),
    CHOMPYHUNT_2(10642,71, "chompyhunt"),
    CITY_OF_THE_DEAD(12843,383, "city of the dead"),
    CITY_OF_THE_DEAD_2(12844,383, "city of the dead"),
    CITY_OF_THE_DEAD_3(13099,383, "city of the dead"),
    CLAUSTROPHOBIA(9293,373, "claustrophobia"),
    CLAUSTROPHOBIA_2(9549,373, "claustrophobia"),
    CLOSE_QUATERS(12602,67, "close quaters"),
    COMPETITION(8781,269, "competition"),
    COMPLICATION(9035,142, "complication"),
    CONTEST(11576,258, "contest"),
    CORPORAL_PUNISH(9035,142, "corporal punish"),
    COURAGE(11673,178, "courage"),
    COURAGE_2(11674,178, "courage"),
    CRYSTAL_CASTLE(9011,259, "crystal castle"),
    CRYSTAL_CASTLE_2(9012,259, "crystal castle"),
    CRYSTAL_CAVE(9797,181, "crystal cave"),
    CRYSTAL_SWORD(12855,169, "crystal sword"),
    CRYSTAL_SWORD_2(10657,169, "crystal sword"),
    CURSED(9623,59, "cursed"),
    CURSED_2(9879,59, "cursed"),
    DAGANNOTH_DAWN(7236,198, "dagannoth dawn"),
    DAGANNOTH_DAWN_2(7748,198, "daganoth dawn"),
    DANCE_OF_THE_UNDEAD(14131,380, "dance of the undead"),
    DANGEROUS_ROAD(11413,336, "dangerous road"),
    DANGEROUS_KEY(14231,381, "dangerous key"),
    DARK(13113,326, "dark"),
    DARK_2(13369,326, "dark"),
    DEAD_CAN_DANCE(12601,476, "dead can dance"),
    DEAD_QUIET(13621,84, "dead quiet"),
    DEAD_QUIET_2(13621,84, "dead quiet"),
    DEAD_QUIET_3(9294,84, "dead quiet"),
    DEADLANDS(14134,288, "deadlands"),
    DEADLANDS_2(14390,288, "deadlands"),
    DEEP_WILDY(11835,37, "deep wildy"),
    DEEP_WILDY_2(11836,37, "deep wildy"),
    DESERT_HEAT(13614,465, "desert heat"),
    DESERT_HEAT2(13615,465, "desert heat"),
    DESERT_VOYAGE(13102,174, "desert voyage"),
    DESERT_VOYAGE_2(13103,174, "desert voyage"),
    DESERT_VOYAGE_3(13359,174, "desert voyage"),
    DIAGNOS_LITTLE_HELPERS(8005,532, "diangos little helpers"),
    DOORWAYS(12598,56, "doorways"),
    DOWN_BELOW(12438,361, "down below"),
    DOWN_BELOW_2(12439,361, "down below"),
    DOWN_TO_EARTH(10571,143, "down to earth"),
    DRAGONTOOTH_ISLAND(15159,358, "dragontooth island"),
    DREAM(12594,327, "dream"),
    DUELARENA(13362,47, "duel arena"),
    DUELARENA_2(13618,47, "duel arena"),
    DUNJUN(11672,173, "dunjun"),
    DUNJUN_2(11928,173, "dunjun"),
    DYNASTY(13358,351, "dynasty"),
    EGYPT(13104,69, "egypt"),
    EGYPT_2(13360,69, "egypt"),
    ELVEN_MIST(9266,252, "elven mist"),
    EMOTION(10033,148, "emotion"),
    EMOTION_2(10309,148, "emotion"),
    EMOTION_3(10133,148, "emotion"),
    EMPEROR(11570,138, "emperor"),
    EMPEROR_2(11670,138, "emperor"),
    ESCAPE_2(10903,17, "escape"),
    EVERYWHERE(8499,268, "everywhere"),
    EVERYWHERE_2(8755,268, "everywhere"),
    EXPANSE(12605,106, "expanse"),
    EXPANSE_2(12852,106, "expanse"),
    EXPANSE_3(12952,106, "expanse"),
    EXPECTING(9778,41, "expecting"),
    EXPECTING_2(9878,41, "expecting"),
    EXPEDITION(11676,153, "expedition"),
    EXPOSED(8752,270, "exposed"),
    FAERIE(9540,118, "faerie"),
    FAERIE_2(9541,118, "faerie"),
    FAITHLESS(12856,337, "faithless"),
    FAITHLESS_2(13112,337, "faithless"),
    FANFARE(11828,72, "fanfare"),
    FAR_AWAY(9265,372, "far away"),
    FENKENSTRAINS(13879,344, "fenkenstrains"),
    FENKENSTRAINS_2(14125,344, "fenkenstrains"),
    FIGHT_OR_FLIGHT(7752,375, "fight or flight"),
    FIGHT_OR_FLIGHT_2(8008,375, "fight or flight"),
    FIND_MY_WAY(10894,312, "find my way"),
    FIND_MY_WAY_2(11150,312, "find my way"),
    FIRE_AND_BRIMSTONE(9552,463, "fire and brimstone"),
    FISHING(11317,119, "fishing"),
    FLUTE_SALAD(12595,163, "flute salad"),
    FORBIDDEN(13111,121, "forbidden"),
    FORBIDDEN_2(13367,121, "forbidden"),
    FOREST(9009,251, "forest"),
    FOREVER(12343,98, "forever"),
    FOREVER_2(12342, 	98,	"forever"),
    FROG_LAND(9802,409, "frog land"),
    FROSTBITE(11323,294, "frostbite"),
    FRUITS_DE_MER(11059,347, "fruits de mer"),
    GAOL(12090,159, "gaol"),
    GAOL_2(10031,159, "gaol"),
    GAOL_3(10131,159, "gaol"),
    GARDEN(12853,125, "garden"),
    GNOME_KING(9782,22, "gnome king"),
    GNOME_KING_2(9783,22, "gnome king"),
    GNOME_VILLAGE(9781,33, "gnome village"),
    GNOMEBALL(9270,112, "gnome ball"),
    GNOMEBALL_2(9527,112, "gnome ball"),
    GOBLIN_GAME(10393,346, "goblin game"),
    GREATNESS(12596,116, "greatness"),
    GROTTO(13720,246, "grotto"),
    GRUMPY(10286,128, "grumpy"),
    HAUNTED_MINE(11077,277, "haunted mine"),
    HAVE_A_BLAST(7757,434, "have a blast"),
    HEART_AND_MIND(10059,190, "heart and mind"),
    HERMIT(9034,97, "hermit"),
    HIGH_SEAS(11057,55, "high seas"),
    HORIZON(11573,18, "horizon"),
    IBAN(8519,1, "iban"),
    IBAN_2(8521,1, "iban"),
    ICE_MELODY(11318,87, "ice melody"),
    IN_BETWEEN(10061,370, "in between"),
    IN_BETWEEN_2(10317,370, "in between"),
    IN_THE_BRINE(1438,530, "in the brine"),
    IN_THE_CLINK(8261,511, "in the clink"),
    IN_THE_MANOR(10287,188, "in the manor"),
    IN_THE_PITS(9808,469, "in the pits"),
    INSECT_QUEEN(13972,260, "insect queen"),
    INSECT_QUEEN_2(14228,260, "insect queen"),
    INSPIRATION(12087,96, "inspiration"),
    INTO_THE_ABYSS(12107,412, "into the abyss"),
    INTO_THE_ABYSS_2(12108,412, "into the abyss"),
    INTREPID(9369,95, "intrepid"),
    INTREPID_2(9370,95, "intrepid"),
    ISLAND_LIFE(10794,306, "island life"),
    ISLAND_LIFE_2(11050,306, "island life"),
    JUNGLE_TROUBLES(11568,479, "jungle troubles"),
    KARAMJA(10899,362, "karamja"),
    KARAMJA_2(10900,362, "karamja"),
    KINGDOM(11319,9, "kingdom"),
    KNIGHTLY(10291,191, "knightly"),
    LA_MORT(8779,134, "la mort"),
    LAIR(13975,287, "lair"),
    LAMENT(12433,542, "lament"),
    LAND_OF_THE_DWARVES(11423,396, "land of the dwarves"),
    LANDLUBBER(10801,164, "landlubber"),
    LASTING(10549,60, "lasting"),
    LEGEND(10808,293, "legend"),
    LEGEND_2(11064,293, "legend"),
    LEGION(12089,66, "legion"),
    LEGION_2(10039,66, "legion"),
    LIGHTHOUSE(10040,320, "lighthouse"),
    LIGHTHOUSE_2(12599,113, "lightness"),
    LIGHTWALK(11061,74, "lightwalk"),
    LONESOME(13203,168, "lonesome"),
    LONG_AGO(10544,161, "long ago"),
    LONG_WAY_HOME(11826,12, "long way home"),
    LOST_SOUL(9008,253, "lost soul"),
    LOST_SOUL_2(9264,253, "lost soul"),
    LULLABY(13365,20, "lullaby"),
    LULLABY_2(10551,20, "lullaby"),
    MAD_EADGAR(11677,264, "mad eadgar"),
    MAGE_ARENA(12349,13, "mage arena"),
    MAGE_ARENA_2(10057,13, "mage arena"),
    MAGIC_DANCE(10288,185, "magic dance"),
    MAGICAL_JOURNEY(10805,184, "magical journey"),
    MARCH(10036,328, "march"),
    MAROONED(11562,304, "marooned"),
    SMAROONED_2(12117,304, "marooned"),
    MARZIPAN(11166,261, "marzipan"),
    MARZIPAN_2(11167,261, "marizpan"),
    MARIZPAN(11421,261, "marizpan"),
    MASQUERADE(10908,340, "masquerade"),
    MAESOLEUM(13722,156, "mausoleum"),
    MEDIVAL(13109,157, "medival"),
    MELLOW(10293,193, "mellow"),
    MELODRAMA(9776,317, "melodrama"),
    MERIDIAN(8497,254, "meridian"),
    MERIDIAN_2(8753,254, "meridian"),
    MILES_AWAY(11571,107, "miles away"),
    MILES_AWAY_2(10569,107, "miles away"),
    MIRACLE_DANCE(11083,65, "miracle dance"),
    MIRAGE(13199,388, "mirage"),
    MISCELLANIA(10044,284, "miscellania"),
    MONARCH_WALTZ(10807,21, "monarch waltz"),
    MONKEY_MADNESS(11051,303, "monkey madness"),
    MONSTER_MELEE(12694,343, "monster melee"),
    MOODY(12600,10, "moody"),
    MOODY_2(9523,10, "moody"),
    MOODY_3(9779,10, "moody"),
    MORYTANIA(13622,48, "morytania"),
    MUDSKIPPER_MELODY(11824,515, "mudskipper melody"),
    NARNODES_THEME(9882,348, "narnodes theme"),
    NATURAL(13620,245, "natural"),
    NATURAL_2(9038,245, "natural"),
    NEWBY_MELODY(12079,62, "newby melody"),
    NEWBY_MELODY_2(12336,62, "newby melody"),
    NEWBY_MELODY_3(12595,62, "newby melody"),
    NERVLAND(9780,155, "nervland"),
    NIGHTFALL(12861,127, "nightfall"),
    NIGHTFALL_2(11827,127, "nightfall"),
    NOMAD(11056,58, "nomad"),
    NULL_AND_VOID(10537,587, "null and void"),
    ORIENTAL(11666,103, "orential"),
    OUT_OF_THE_DEEP(10140,322, "out of the deep"),
    OVER_TO_NARDAH(13613,447, "over to nardah"),
    OVERPASS(9267,256, "overpass"),
    OVERTURE(10806,7, "overture"),
    PARADE(13110,93, "parade"),
    PARADE_2(13366,93, "parade"),
    PATH_OF_PERIL(10575,393, "path of peril"),
    PATH_OF_PERIL_2(10831,393, "path of paril"),
    PATHWAYS(10901,364, "pathways"),
    PHASMATY(14746,354, "phasmaty"),
    PHAESENT_PEASANT(10314,419, "phaesant peasant"),
    PHAESEMT_PEASANT(10315,419, "phaesant peasant"),
    PIRATES_OF_PERIL(12093,334, "pirates of peril"),
    PRINCIPALITY(11575,149, "principality"),
    RAT_A_TAT_TAT(11599,482, "rat a tat tat"),
    RAT_HUNT(11343,491, "rat hunt"),
    READY_FOR_BATTLE(9620,318, "ready for battle"),
    REGAL(13117,329, "regal"),
    REGGAE(11565,78, "reggae"),
    REGGAE_2(11821,78, "reggae"),
    RELLEKKA(10297,289, "rellekka"),
    RELLEKKA_2(10554,289, "rellekka"),
    RIGHTEOUSNESS(9803,262, "righteousness"),
    RIVERSIDE(10803,91, "riverside"),
    RIDERSIDE(8496,91, "riverside"),
    ROMANCING_THE_CRONE(11068,335, "romancing the crone"),
    ROMPER_CHOMPER(9263,390, "romper chomper"),
    ROMPER_CHOMPER2(9519,390, "romper chomper"),
    ROYALE(11671,53, "royale"),
    RUNE_ESSENCE(11595,57, "rune essence"),
    SAD_MEADOW(10035,5, "sad meadow"),
    SAD_MEADOW_2(11081,5, "sad meadow"),
    SAGA(10296,290, "saga"),
    SAGA_2(10552,290, "saga"),
    SARCOPHEGUS(12945,359, "sarcophegus"),
    SARIMS_VERMIN(11926,490, "sarims vermin"),
    SCAPE_CAVE(12698,144, "scape cave"),
    SCAPE_CAVE_2(13210,144, "scape cave"),
    SCAPE_CAVE_3(12437,144, "scape cave"),
    SCAPE_CAVE_4(12436,144, "scape cave"),
    SCAPE_SAD(13116,331, "scape sad"),
    SCAPE_SAD_2(13372,331, "scape sad"),
    SCAPE_SOFT(11829,54, "scape soft"),
    SCAPE_WILD(12857,332, "scape wild"),
    SCAPE_WILD_2(12604,332, "scape wild"),
    SCAPE_WILD_3(12860,332, "scape wild"),
    SCARAB(12589,352, "scarab"),
    SCARAB_2(13101,352, "scarab"),
    SEA_SHANTY(11569,92, "sea shanty"),
    SEA_SHANTY_2(12082,35, "sea shanty 2"),
    SERENADE(9521,110, "serenade"),
    SERENADE_2(9777,110, "serenade"),
    SERENE(11837,52, "serene"),
    SERENE_2(11936,52, "serene"),
    SERENE_3(11937,52, "serene"),
    SERENE_4(11939,52, "serene"),
    SETTLEMENT(11065,356, "settlement"),
    SHADOWLAND(13618,286, "shadowland"),
    SHADOWLAND_2(13875,286, "shadowland"),
    SHADOWLAND_3(8526,286, "shadowland"),
    SHINE(13363,122, "shine"),
    SHINING(13858,120, "shining"),
    SHIPWRECKED(14391,353, "shipwrecked"),
    SHOWDOWN(10895,311, "showdown"),
    SOJOURN(11321,257, "sojourn"),
    SOJOURN_1(11577,257, "sojourn"),
    SOUNDSCAPE(9774,80, "soundscape"),
    SOUNDSCAPE_2(10030,80, "soundscape"),
    SPHINX(13100,387, "sphinx"),
    SPIRIT(12597,175, "spirit"),
    SLENDOUR(11574,77, "slendour"),
    SPOOKY(12340,333, "spooky"),
    SPOOKY_2(7758,333, "spooky"),
    STAGNANT(13876,241, "stagnant"),
    STAGNANT_2(8782,241, "stagnant"),
    STARLIGHT(11925,108, "starlight"),
    STARLIGHT_2(12949,108, "starlight"),
    START(12339,151, "start"),
    STILL_NIGHT(13108,111, "still night"),
    STILLNESS(13977,319, "stillness"),
    STORMBREW(10577,568, "stormbrew"),
    STRANDED(11322,292, "stranded"),
    STRANDED_2(11578,292, "stranded"),
    STRATOSPHERE(8523,243, "stratosphere"),
    SUBTERRNEA(10142,517, "subterrnea"),
    SUBTERRNEA_2(10398,517, "subterrnea"),
    SUNBURN(12846,267, "sunburn"),
    SUNBURN_2(13357,267, "sunburn"),
    SUPERSTITION(11153,265, "superstition"),
    TALE_OF_KELDAGRIM(11679,395, "tale of keldagrim"),
    TALE_OF_KELDAGRIM_2(11679,395, "tale of keldagrim"),
    TALKING_FOREST(10550,140, "talking forest"),
    TEARS_OF_GUTHIX(12948,397, "tears of guthix"),
    TECHNOLOGY(10310,296, "technology"),
    TECHNOLOGY_2(10566,296, "technology"),
    TEMPLE_OF_LIGHT(7496,376, "temple of light"),
    TEMPLE(11151,307, "temple"),
    THEME(10294,109, "theme"),
    THEME_2(10138,109, "theme"),
    THEME_3(10384,109, "theme"),
    TIME_OUT(11591,242, "time out"),
    TIME_TO_MINE(11422,369, "time to mine"),
    TIPTOE(12440,338, "tiptoe"),
    TITLE_FIGHT(12696,525, "title fight"),
    TOMORROW(12081,105, "tomorrow"),
    TOO_MANY_COOKS(11930,582, "too many cooks"),
    TAWLER_MINOR(7755,51, "tawler minor"),
    TAWLER_MINOR_2(8011,51, "tawler minor"),
    TRAWLER(7499,38, "trawler"),
    TREE_SPIRITS(9268,130, "tree spirits"),
    TREE_SPIRITS_2(9524,130, "tree spirits"),
    TREMPLE(11320,187, "tremple"),
    TRIBAL_BACKGROUND(11312,162, "tribal background"),
    TRIBAL_BACKGROUND_2(11412,162, "tribal background"),
    TRIBAL(11311,165, "tribal"),
    TRINITY(10804,192, "trinity"),
    TRINITY_2(10904,192, "trinity"),
    TROUBLED(11833,183, "troubled"),
    TWIGHLIGHT(10906,88, "twighlight"),
    UNDERCURRENT(12345,176, "undercurrent"),
    UNDERGROUND(13368,179, "underground"),
    UNDERGROUND_1(11416,179, "underground"),
    UNDERSTANDING(9547,131, "understanding"),
    UNKNOWN_LAND(12338,3, "unknown land"),
    UPCOMING(10546,70, "upcoming"),
    VENTURE(13364,75, "venture"),
    VICTORY_IS_MINE(12696,528, "victory is mine"),
    VILLAGE(13878,61, "village"),
    VISION(12337,85, "vision"),
    VISION_2(12436,85, "vision"),
    VISION_3(12438,85, "vision"),
    VOODOO_CULT(9545,30, "voodo cult"),
    VOODOO_CULT_2(11665,30, "voodo cult"),
    VOYAGE(10038,32, "voyage"),
    WANDER(12083,49, "wander"),
    WARRIOR(10653,295, "warrior"),
    WATERFALL(10036,82, "waterfall"),
    WATERFALL_2(10037,82, "waterfall"),
    WATERFALL_3(10137,82, "waterfall"),
    WATERLOGGED(13877,244, "waterlogged"),
    WATERLOGGED_2(14133,244, "waterlogged"),
    WATERLOGGED_3(8014,244, "waterlogged"),
    WATERLOGGED_4(8270,244, "waterlogged"),
    WAYWARD(9875,394, "wayward"),
    WELL_OF_VOYAGE(9366,271, "well of voyage"),
    WILD_SIDE(12092,475, "wild side"),
    WILD_SIDE_2(12348,475, "wild side"),
    WILDERNESS(11832,435, "wilderness"),
    WILDERNESS_REGION_2(12346,435, "wilderness"),
    WILDERNESS_2(12091,42, "wilderness 2"),
    WILDERNESS_2_REGION_2(12347,42, "wilderness 2"),
    WILDERNESS_3(11834,43, "wilderness 3"),
    WILDWOOD(12344,8, "wildwood"),
    WITCHING(13114,14, "witching"),
    WITCHING_2(13370,14, "witching"),
    WOE_OF_THE_WYVERN(12181,529, "woe of the wyvern"),
    WONDER(11831,34, "wonder"),
    WONDEROUS(10548,81, "wonderous"),
    WOODLAND(8498,255, "woodland"),
    WOOLAND_2(8754,255, "wooland"),
    WORKSHOP(12084,15, "workshop"),
    XENOPHOBE(7492,524, "xenophobe"),
    XENOPHOBE_2(11589,524, "xenophobe"),
    YESTERYEAR(12849,145, "yesteryear"),
    ZEALOT(10827,146, "zealot"),
    ZOGRE_DANCE(9775,392, "zogre dance"),
    SEVENTH_REALM(10644,363, "7th realm"),
    SEVENTH_REALM_2(10645,363, "7th realm"),
    HARMONY(7507,76, "harmony"),
    HARMONY_2(12850,76, "harmony"),
    HARMONY_3(12851,76, "harmony"),
    HARMONY_4(10823,76, "harmony"),
    HARMONY_5(11079,76, "harmony"),
    DEEP_DOWN(10822,278, "deep down");

    int regionId, songId;
    String songName;

    Music(int regionId,  int songId, String songName) {
        this.regionId = regionId;
        this.songId = songId;
        this.songName = songName;
    }

    public int getRegionId() {
        return this.regionId;
    }

    public int getSongId() {
        return this.songId;
    }

    public String getSongName() {
        return this.songName;
    }

    /**
     * Gets the Music for a given region id.
     *
     * @param regionId
     * @return
     */
    public static Optional<Music> getForRegion(int regionId) {
        return Arrays.stream(Music.values()).filter(m -> m.getRegionId() == regionId).findFirst();
    }
}