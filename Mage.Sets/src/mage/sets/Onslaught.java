package mage.sets;

import mage.ObjectColor;
import mage.cards.CardGraphicInfo;
import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

public class Onslaught extends ExpansionSet {

    private static final Onslaught instance = new Onslaught();

    public static Onslaught getInstance() {
        return instance;
    }

    private Onslaught() {
        super("Onslaught", "ONS", ExpansionSet.buildDate(2002, 10, 7), SetType.EXPANSION);
        this.blockName = "Onslaught";
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("Accursed Centaur", 123, Rarity.COMMON, mage.cards.a.AccursedCentaur.class));
        cards.add(new SetCardInfo("Aether Charge", 184, Rarity.UNCOMMON, mage.cards.a.AetherCharge.class));
        cards.add(new SetCardInfo("Aggravated Assault", 185, Rarity.RARE, mage.cards.a.AggravatedAssault.class));
        cards.add(new SetCardInfo("Airborne Aid", 62, Rarity.COMMON, mage.cards.a.AirborneAid.class));
        cards.add(new SetCardInfo("Airdrop Condor", 186, Rarity.UNCOMMON, mage.cards.a.AirdropCondor.class));
        cards.add(new SetCardInfo("Akroma's Blessing", 1, Rarity.UNCOMMON, mage.cards.a.AkromasBlessing.class));
        cards.add(new SetCardInfo("Akroma's Vengeance", 2, Rarity.RARE, mage.cards.a.AkromasVengeance.class));
        cards.add(new SetCardInfo("Ancestor's Prophet", 3, Rarity.RARE, mage.cards.a.AncestorsProphet.class));
        cards.add(new SetCardInfo("Animal Magnetism", 245, Rarity.RARE, mage.cards.a.AnimalMagnetism.class));
        cards.add(new SetCardInfo("Annex", 63, Rarity.UNCOMMON, mage.cards.a.Annex.class));
        cards.add(new SetCardInfo("Anurid Murkdiver", 124, Rarity.COMMON, mage.cards.a.AnuridMurkdiver.class));
        cards.add(new SetCardInfo("Aphetto Alchemist", 64, Rarity.UNCOMMON, mage.cards.a.AphettoAlchemist.class));
        cards.add(new SetCardInfo("Aphetto Dredging", 125, Rarity.COMMON, mage.cards.a.AphettoDredging.class));
        cards.add(new SetCardInfo("Aphetto Grifter", 65, Rarity.UNCOMMON, mage.cards.a.AphettoGrifter.class));
        cards.add(new SetCardInfo("Aphetto Vulture", 126, Rarity.UNCOMMON, mage.cards.a.AphettoVulture.class));
        cards.add(new SetCardInfo("Arcanis the Omnipotent", 66, Rarity.RARE, mage.cards.a.ArcanisTheOmnipotent.class));
        cards.add(new SetCardInfo("Ascending Aven", 68, Rarity.COMMON, mage.cards.a.AscendingAven.class));
        cards.add(new SetCardInfo("Astral Slide", 4, Rarity.UNCOMMON, mage.cards.a.AstralSlide.class));
        cards.add(new SetCardInfo("Aura Extraction", 5, Rarity.UNCOMMON, mage.cards.a.AuraExtraction.class));
        cards.add(new SetCardInfo("Aurification", 6, Rarity.RARE, mage.cards.a.Aurification.class));
        cards.add(new SetCardInfo("Avarax", 187, Rarity.UNCOMMON, mage.cards.a.Avarax.class));
        cards.add(new SetCardInfo("Aven Brigadier", 7, Rarity.RARE, mage.cards.a.AvenBrigadier.class));
        cards.add(new SetCardInfo("Aven Fateshaper", 69, Rarity.UNCOMMON, mage.cards.a.AvenFateshaper.class));
        cards.add(new SetCardInfo("Aven Soulgazer", 8, Rarity.UNCOMMON, mage.cards.a.AvenSoulgazer.class));
        cards.add(new SetCardInfo("Backslide", 70, Rarity.COMMON, mage.cards.b.Backslide.class));
        cards.add(new SetCardInfo("Barkhide Mauler", 246, Rarity.COMMON, mage.cards.b.BarkhideMauler.class));
        cards.add(new SetCardInfo("Barren Moor", 312, Rarity.COMMON, mage.cards.b.BarrenMoor.class));
        cards.add(new SetCardInfo("Battering Craghorn", 188, Rarity.COMMON, mage.cards.b.BatteringCraghorn.class));
        cards.add(new SetCardInfo("Biorhythm", 247, Rarity.RARE, mage.cards.b.Biorhythm.class));
        cards.add(new SetCardInfo("Birchlore Rangers", 248, Rarity.COMMON, mage.cards.b.BirchloreRangers.class));
        cards.add(new SetCardInfo("Blackmail", 127, Rarity.UNCOMMON, mage.cards.b.Blackmail.class));
        cards.add(new SetCardInfo("Blatant Thievery", 71, Rarity.RARE, mage.cards.b.BlatantThievery.class));
        cards.add(new SetCardInfo("Blistering Firecat", 189, Rarity.RARE, mage.cards.b.BlisteringFirecat.class));
        cards.add(new SetCardInfo("Bloodline Shaman", 249, Rarity.UNCOMMON, mage.cards.b.BloodlineShaman.class));
        cards.add(new SetCardInfo("Bloodstained Mire", 313, Rarity.RARE, mage.cards.b.BloodstainedMire.class, new CardGraphicInfo(new ObjectColor("RB"), null, false)));
        cards.add(new SetCardInfo("Boneknitter", 128, Rarity.UNCOMMON, mage.cards.b.Boneknitter.class));
        cards.add(new SetCardInfo("Break Open", 190, Rarity.COMMON, mage.cards.b.BreakOpen.class));
        cards.add(new SetCardInfo("Brightstone Ritual", 191, Rarity.COMMON, mage.cards.b.BrightstoneRitual.class));
        cards.add(new SetCardInfo("Broodhatch Nantuko", 250, Rarity.UNCOMMON, mage.cards.b.BroodhatchNantuko.class));
        cards.add(new SetCardInfo("Cabal Archon", 129, Rarity.UNCOMMON, mage.cards.c.CabalArchon.class));
        cards.add(new SetCardInfo("Cabal Executioner", 130, Rarity.UNCOMMON, mage.cards.c.CabalExecutioner.class));
        cards.add(new SetCardInfo("Cabal Slaver", 131, Rarity.UNCOMMON, mage.cards.c.CabalSlaver.class));
        cards.add(new SetCardInfo("Catapult Master", 10, Rarity.RARE, mage.cards.c.CatapultMaster.class));
        cards.add(new SetCardInfo("Catapult Squad", 11, Rarity.UNCOMMON, mage.cards.c.CatapultSquad.class));
        cards.add(new SetCardInfo("Centaur Glade", 251, Rarity.UNCOMMON, mage.cards.c.CentaurGlade.class));
        cards.add(new SetCardInfo("Chain of Acid", 252, Rarity.UNCOMMON, mage.cards.c.ChainOfAcid.class));
        cards.add(new SetCardInfo("Chain of Plasma", 193, Rarity.UNCOMMON, mage.cards.c.ChainOfPlasma.class));
        cards.add(new SetCardInfo("Chain of Silence", 12, Rarity.UNCOMMON, mage.cards.c.ChainOfSilence.class));
        cards.add(new SetCardInfo("Chain of Smog", 132, Rarity.UNCOMMON, mage.cards.c.ChainOfSmog.class));
        cards.add(new SetCardInfo("Chain of Vapor", 73, Rarity.UNCOMMON, mage.cards.c.ChainOfVapor.class));
        cards.add(new SetCardInfo("Charging Slateback", 194, Rarity.COMMON, mage.cards.c.ChargingSlateback.class));
        cards.add(new SetCardInfo("Choking Tethers", 74, Rarity.COMMON, mage.cards.c.ChokingTethers.class));
        cards.add(new SetCardInfo("Clone", 75, Rarity.RARE, mage.cards.c.Clone.class));
        cards.add(new SetCardInfo("Complicate", 76, Rarity.UNCOMMON, mage.cards.c.Complicate.class));
        cards.add(new SetCardInfo("Contested Cliffs", 314, Rarity.RARE, mage.cards.c.ContestedCliffs.class));
        cards.add(new SetCardInfo("Convalescent Care", 14, Rarity.RARE, mage.cards.c.ConvalescentCare.class));
        cards.add(new SetCardInfo("Cover of Darkness", 133, Rarity.RARE, mage.cards.c.CoverOfDarkness.class));
        cards.add(new SetCardInfo("Crafty Pathmage", 77, Rarity.COMMON, mage.cards.c.CraftyPathmage.class));
        cards.add(new SetCardInfo("Crowd Favorites", 15, Rarity.UNCOMMON, mage.cards.c.CrowdFavorites.class));
        cards.add(new SetCardInfo("Crude Rampart", 17, Rarity.UNCOMMON, mage.cards.c.CrudeRampart.class));
        cards.add(new SetCardInfo("Cruel Revival", 135, Rarity.COMMON, mage.cards.c.CruelRevival.class));
        cards.add(new SetCardInfo("Cryptic Gateway", 306, Rarity.RARE, mage.cards.c.CrypticGateway.class));
        cards.add(new SetCardInfo("Custody Battle", 197, Rarity.UNCOMMON, mage.cards.c.CustodyBattle.class));
        cards.add(new SetCardInfo("Daru Cavalier", 18, Rarity.COMMON, mage.cards.d.DaruCavalier.class));
        cards.add(new SetCardInfo("Daru Encampment", 315, Rarity.UNCOMMON, mage.cards.d.DaruEncampment.class));
        cards.add(new SetCardInfo("Daru Healer", 19, Rarity.COMMON, mage.cards.d.DaruHealer.class));
        cards.add(new SetCardInfo("Daru Lancer", 20, Rarity.COMMON, mage.cards.d.DaruLancer.class));
        cards.add(new SetCardInfo("Daunting Defender", 21, Rarity.COMMON, mage.cards.d.DauntingDefender.class));
        cards.add(new SetCardInfo("Dawning Purist", 22, Rarity.UNCOMMON, mage.cards.d.DawningPurist.class));
        cards.add(new SetCardInfo("Death Match", 136, Rarity.RARE, mage.cards.d.DeathMatch.class));
        cards.add(new SetCardInfo("Death Pulse", 137, Rarity.UNCOMMON, mage.cards.d.DeathPulse.class));
        cards.add(new SetCardInfo("Demystify", 24, Rarity.COMMON, mage.cards.d.Demystify.class));
        cards.add(new SetCardInfo("Dirge of Dread", 138, Rarity.COMMON, mage.cards.d.DirgeOfDread.class));
        cards.add(new SetCardInfo("Disciple of Grace", 25, Rarity.COMMON, mage.cards.d.DiscipleOfGrace.class));
        cards.add(new SetCardInfo("Disciple of Malice", 139, Rarity.COMMON, mage.cards.d.DiscipleOfMalice.class));
        cards.add(new SetCardInfo("Discombobulate", 79, Rarity.UNCOMMON, mage.cards.d.Discombobulate.class));
        cards.add(new SetCardInfo("Dispersing Orb", 80, Rarity.UNCOMMON, mage.cards.d.DispersingOrb.class));
        cards.add(new SetCardInfo("Disruptive Pitmage", 81, Rarity.COMMON, mage.cards.d.DisruptivePitmage.class));
        cards.add(new SetCardInfo("Dive Bomber", 26, Rarity.COMMON, mage.cards.d.DiveBomber.class));
        cards.add(new SetCardInfo("Doomed Necromancer", 140, Rarity.RARE, mage.cards.d.DoomedNecromancer.class));
        cards.add(new SetCardInfo("Doubtless One", 27, Rarity.UNCOMMON, mage.cards.d.DoubtlessOne.class));
        cards.add(new SetCardInfo("Dragon Roost", 198, Rarity.RARE, mage.cards.d.DragonRoost.class));
        cards.add(new SetCardInfo("Dream Chisel", 308, Rarity.RARE, mage.cards.d.DreamChisel.class));
        cards.add(new SetCardInfo("Dwarven Blastminer", 199, Rarity.UNCOMMON, mage.cards.d.DwarvenBlastminer.class));
        cards.add(new SetCardInfo("Ebonblade Reaper", 141, Rarity.RARE, mage.cards.e.EbonbladeReaper.class));
        cards.add(new SetCardInfo("Elven Riders", 254, Rarity.UNCOMMON, mage.cards.e.ElvenRiders.class));
        cards.add(new SetCardInfo("Elvish Guidance", 255, Rarity.COMMON, mage.cards.e.ElvishGuidance.class));
        cards.add(new SetCardInfo("Elvish Pathcutter", 256, Rarity.COMMON, mage.cards.e.ElvishPathcutter.class));
        cards.add(new SetCardInfo("Elvish Pioneer", 257, Rarity.COMMON, mage.cards.e.ElvishPioneer.class));
        cards.add(new SetCardInfo("Elvish Scrapper", 258, Rarity.UNCOMMON, mage.cards.e.ElvishScrapper.class));
        cards.add(new SetCardInfo("Elvish Vanguard", 259, Rarity.RARE, mage.cards.e.ElvishVanguard.class));
        cards.add(new SetCardInfo("Elvish Warrior", 260, Rarity.COMMON, mage.cards.e.ElvishWarrior.class));
        cards.add(new SetCardInfo("Embermage Goblin", 200, Rarity.UNCOMMON, mage.cards.e.EmbermageGoblin.class));
        cards.add(new SetCardInfo("Enchantress's Presence", 261, Rarity.RARE, mage.cards.e.EnchantresssPresence.class));
        cards.add(new SetCardInfo("Erratic Explosion", 201, Rarity.COMMON, mage.cards.e.ErraticExplosion.class));
        cards.add(new SetCardInfo("Essence Fracture", 82, Rarity.UNCOMMON, mage.cards.e.EssenceFracture.class));
        cards.add(new SetCardInfo("Everglove Courier", 262, Rarity.UNCOMMON, mage.cards.e.EvergloveCourier.class));
        cards.add(new SetCardInfo("Exalted Angel", 28, Rarity.RARE, mage.cards.e.ExaltedAngel.class));
        cards.add(new SetCardInfo("Explosive Vegetation", 263, Rarity.UNCOMMON, mage.cards.e.ExplosiveVegetation.class));
        cards.add(new SetCardInfo("Fade from Memory", 144, Rarity.UNCOMMON, mage.cards.f.FadeFromMemory.class));
        cards.add(new SetCardInfo("Fallen Cleric", 145, Rarity.COMMON, mage.cards.f.FallenCleric.class));
        cards.add(new SetCardInfo("False Cure", 146, Rarity.RARE, mage.cards.f.FalseCure.class));
        cards.add(new SetCardInfo("Feeding Frenzy", 147, Rarity.UNCOMMON, mage.cards.f.FeedingFrenzy.class));
        cards.add(new SetCardInfo("Festering Goblin", 148, Rarity.COMMON, mage.cards.f.FesteringGoblin.class));
        cards.add(new SetCardInfo("Fever Charm", 202, Rarity.COMMON, mage.cards.f.FeverCharm.class));
        cards.add(new SetCardInfo("Flamestick Courier", 203, Rarity.UNCOMMON, mage.cards.f.FlamestickCourier.class));
        cards.add(new SetCardInfo("Fleeting Aven", 83, Rarity.UNCOMMON, mage.cards.f.FleetingAven.class));
        cards.add(new SetCardInfo("Flooded Strand", 316, Rarity.RARE, mage.cards.f.FloodedStrand.class, new CardGraphicInfo(new ObjectColor("UW"), null, false)));
        cards.add(new SetCardInfo("Foothill Guide", 29, Rarity.COMMON, mage.cards.f.FoothillGuide.class));
        cards.add(new SetCardInfo("Forest", 347, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 348, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 349, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 350, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forgotten Cave", 317, Rarity.COMMON, mage.cards.f.ForgottenCave.class));
        cards.add(new SetCardInfo("Frightshroud Courier", 149, Rarity.UNCOMMON, mage.cards.f.FrightshroudCourier.class));
        cards.add(new SetCardInfo("Future Sight", 84, Rarity.RARE, mage.cards.f.FutureSight.class));
        cards.add(new SetCardInfo("Gangrenous Goliath", 150, Rarity.RARE, mage.cards.g.GangrenousGoliath.class));
        cards.add(new SetCardInfo("Ghosthelm Courier", 85, Rarity.UNCOMMON, mage.cards.g.GhosthelmCourier.class));
        cards.add(new SetCardInfo("Gigapede", 264, Rarity.RARE, mage.cards.g.Gigapede.class));
        cards.add(new SetCardInfo("Glory Seeker", 31, Rarity.COMMON, mage.cards.g.GlorySeeker.class));
        cards.add(new SetCardInfo("Gluttonous Zombie", 151, Rarity.UNCOMMON, mage.cards.g.GluttonousZombie.class));
        cards.add(new SetCardInfo("Goblin Burrows", 318, Rarity.UNCOMMON, mage.cards.g.GoblinBurrows.class));
        cards.add(new SetCardInfo("Goblin Piledriver", 205, Rarity.RARE, mage.cards.g.GoblinPiledriver.class));
        cards.add(new SetCardInfo("Goblin Pyromancer", 206, Rarity.RARE, mage.cards.g.GoblinPyromancer.class));
        cards.add(new SetCardInfo("Goblin Sharpshooter", 207, Rarity.RARE, mage.cards.g.GoblinSharpshooter.class));
        cards.add(new SetCardInfo("Goblin Sky Raider", 208, Rarity.COMMON, mage.cards.g.GoblinSkyRaider.class));
        cards.add(new SetCardInfo("Goblin Sledder", 209, Rarity.COMMON, mage.cards.g.GoblinSledder.class));
        cards.add(new SetCardInfo("Goblin Taskmaster", 210, Rarity.COMMON, mage.cards.g.GoblinTaskmaster.class));
        cards.add(new SetCardInfo("Grand Coliseum", 319, Rarity.RARE, mage.cards.g.GrandColiseum.class));
        cards.add(new SetCardInfo("Grand Melee", 211, Rarity.RARE, mage.cards.g.GrandMelee.class));
        cards.add(new SetCardInfo("Grassland Crusader", 32, Rarity.COMMON, mage.cards.g.GrasslandCrusader.class));
        cards.add(new SetCardInfo("Gratuitous Violence", 212, Rarity.RARE, mage.cards.g.GratuitousViolence.class));
        cards.add(new SetCardInfo("Gravel Slinger", 33, Rarity.COMMON, mage.cards.g.GravelSlinger.class));
        cards.add(new SetCardInfo("Gravespawn Sovereign", 152, Rarity.RARE, mage.cards.g.GravespawnSovereign.class));
        cards.add(new SetCardInfo("Grinning Demon", 153, Rarity.RARE, mage.cards.g.GrinningDemon.class));
        cards.add(new SetCardInfo("Gustcloak Harrier", 34, Rarity.COMMON, mage.cards.g.GustcloakHarrier.class));
        cards.add(new SetCardInfo("Gustcloak Runner", 35, Rarity.COMMON, mage.cards.g.GustcloakRunner.class));
        cards.add(new SetCardInfo("Gustcloak Savior", 36, Rarity.RARE, mage.cards.g.GustcloakSavior.class));
        cards.add(new SetCardInfo("Gustcloak Sentinel", 37, Rarity.UNCOMMON, mage.cards.g.GustcloakSentinel.class));
        cards.add(new SetCardInfo("Gustcloak Skirmisher", 38, Rarity.UNCOMMON, mage.cards.g.GustcloakSkirmisher.class));
        cards.add(new SetCardInfo("Harsh Mercy", 39, Rarity.RARE, mage.cards.h.HarshMercy.class));
        cards.add(new SetCardInfo("Haunted Cadaver", 154, Rarity.COMMON, mage.cards.h.HauntedCadaver.class));
        cards.add(new SetCardInfo("Head Games", 155, Rarity.RARE, mage.cards.h.HeadGames.class));
        cards.add(new SetCardInfo("Headhunter", 156, Rarity.UNCOMMON, mage.cards.h.Headhunter.class));
        cards.add(new SetCardInfo("Heedless One", 265, Rarity.UNCOMMON, mage.cards.h.HeedlessOne.class));
        cards.add(new SetCardInfo("Hystrodon", 266, Rarity.RARE, mage.cards.h.Hystrodon.class));
        cards.add(new SetCardInfo("Imagecrafter", 87, Rarity.COMMON, mage.cards.i.Imagecrafter.class));
        cards.add(new SetCardInfo("Improvised Armor", 40, Rarity.UNCOMMON, mage.cards.i.ImprovisedArmor.class));
        cards.add(new SetCardInfo("Infest", 157, Rarity.UNCOMMON, mage.cards.i.Infest.class));
        cards.add(new SetCardInfo("Information Dealer", 88, Rarity.COMMON, mage.cards.i.InformationDealer.class));
        cards.add(new SetCardInfo("Inspirit", 41, Rarity.UNCOMMON, mage.cards.i.Inspirit.class));
        cards.add(new SetCardInfo("Insurrection", 213, Rarity.RARE, mage.cards.i.Insurrection.class));
        cards.add(new SetCardInfo("Invigorating Boon", 267, Rarity.UNCOMMON, mage.cards.i.InvigoratingBoon.class));
        cards.add(new SetCardInfo("Ironfist Crusher", 42, Rarity.UNCOMMON, mage.cards.i.IronfistCrusher.class));
        cards.add(new SetCardInfo("Island", 335, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 336, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 337, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 338, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ixidor's Will", 90, Rarity.COMMON, mage.cards.i.IxidorsWill.class));
        cards.add(new SetCardInfo("Ixidor, Reality Sculptor", 89, Rarity.RARE, mage.cards.i.IxidorRealitySculptor.class));
        cards.add(new SetCardInfo("Jareth, Leonine Titan", 43, Rarity.RARE, mage.cards.j.JarethLeonineTitan.class));
        cards.add(new SetCardInfo("Kamahl, Fist of Krosa", 268, Rarity.RARE, mage.cards.k.KamahlFistOfKrosa.class));
        cards.add(new SetCardInfo("Krosan Colossus", 270, Rarity.RARE, mage.cards.k.KrosanColossus.class));
        cards.add(new SetCardInfo("Krosan Groundshaker", 271, Rarity.UNCOMMON, mage.cards.k.KrosanGroundshaker.class));
        cards.add(new SetCardInfo("Krosan Tusker", 272, Rarity.COMMON, mage.cards.k.KrosanTusker.class));
        cards.add(new SetCardInfo("Lavamancer's Skill", 215, Rarity.COMMON, mage.cards.l.LavamancersSkill.class));
        cards.add(new SetCardInfo("Lay Waste", 216, Rarity.COMMON, mage.cards.l.LayWaste.class));
        cards.add(new SetCardInfo("Leery Fogbeast", 273, Rarity.COMMON, mage.cards.l.LeeryFogbeast.class));
        cards.add(new SetCardInfo("Lightning Rift", 217, Rarity.UNCOMMON, mage.cards.l.LightningRift.class));
        cards.add(new SetCardInfo("Lonely Sandbar", 320, Rarity.COMMON, mage.cards.l.LonelySandbar.class));
        cards.add(new SetCardInfo("Mage's Guile", 91, Rarity.COMMON, mage.cards.m.MagesGuile.class));
        cards.add(new SetCardInfo("Mana Echoes", 218, Rarity.RARE, mage.cards.m.ManaEchoes.class));
        cards.add(new SetCardInfo("Menacing Ogre", 219, Rarity.RARE, mage.cards.m.MenacingOgre.class));
        cards.add(new SetCardInfo("Misery Charm", 158, Rarity.COMMON, mage.cards.m.MiseryCharm.class));
        cards.add(new SetCardInfo("Mistform Dreamer", 93, Rarity.COMMON, mage.cards.m.MistformDreamer.class));
        cards.add(new SetCardInfo("Mistform Mutant", 95, Rarity.UNCOMMON, mage.cards.m.MistformMutant.class));
        cards.add(new SetCardInfo("Mistform Shrieker", 96, Rarity.UNCOMMON, mage.cards.m.MistformShrieker.class));
        cards.add(new SetCardInfo("Mobilization", 44, Rarity.RARE, mage.cards.m.Mobilization.class));
        cards.add(new SetCardInfo("Mountain", 343, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 344, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 345, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 346, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mythic Proportions", 274, Rarity.RARE, mage.cards.m.MythicProportions.class));
        cards.add(new SetCardInfo("Nameless One", 100, Rarity.UNCOMMON, mage.cards.n.NamelessOne.class));
        cards.add(new SetCardInfo("Nantuko Husk", 159, Rarity.COMMON, mage.cards.n.NantukoHusk.class));
        cards.add(new SetCardInfo("Naturalize", 275, Rarity.COMMON, mage.cards.n.Naturalize.class));
        cards.add(new SetCardInfo("Nosy Goblin", 220, Rarity.COMMON, mage.cards.n.NosyGoblin.class));
        cards.add(new SetCardInfo("Nova Cleric", 45, Rarity.UNCOMMON, mage.cards.n.NovaCleric.class));
        cards.add(new SetCardInfo("Oblation", 46, Rarity.RARE, mage.cards.o.Oblation.class));
        cards.add(new SetCardInfo("Oversold Cemetery", 160, Rarity.RARE, mage.cards.o.OversoldCemetery.class));
        cards.add(new SetCardInfo("Overwhelming Instinct", 276, Rarity.UNCOMMON, mage.cards.o.OverwhelmingInstinct.class));
        cards.add(new SetCardInfo("Pacifism", 47, Rarity.COMMON, mage.cards.p.Pacifism.class));
        cards.add(new SetCardInfo("Patriarch's Bidding", 161, Rarity.RARE, mage.cards.p.PatriarchsBidding.class));
        cards.add(new SetCardInfo("Pearlspear Courier", 48, Rarity.UNCOMMON, mage.cards.p.PearlspearCourier.class));
        cards.add(new SetCardInfo("Peer Pressure", 101, Rarity.RARE, mage.cards.p.PeerPressure.class));
        cards.add(new SetCardInfo("Piety Charm", 49, Rarity.COMMON, mage.cards.p.PietyCharm.class));
        cards.add(new SetCardInfo("Pinpoint Avalanche", 221, Rarity.COMMON, mage.cards.p.PinpointAvalanche.class));
        cards.add(new SetCardInfo("Plains", 331, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 332, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 333, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 334, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Polluted Delta", 321, Rarity.RARE, mage.cards.p.PollutedDelta.class, new CardGraphicInfo(new ObjectColor("UB"), null, false)));
        cards.add(new SetCardInfo("Primal Boost", 277, Rarity.UNCOMMON, mage.cards.p.PrimalBoost.class));
        cards.add(new SetCardInfo("Profane Prayers", 162, Rarity.COMMON, mage.cards.p.ProfanePrayers.class));
        cards.add(new SetCardInfo("Prowling Pangolin", 163, Rarity.UNCOMMON, mage.cards.p.ProwlingPangolin.class));
        cards.add(new SetCardInfo("Psychic Trance", 102, Rarity.RARE, mage.cards.p.PsychicTrance.class));
        cards.add(new SetCardInfo("Quicksilver Dragon", 103, Rarity.RARE, mage.cards.q.QuicksilverDragon.class));
        cards.add(new SetCardInfo("Ravenous Baloth", 278, Rarity.RARE, mage.cards.r.RavenousBaloth.class));
        cards.add(new SetCardInfo("Read the Runes", 104, Rarity.RARE, mage.cards.r.ReadTheRunes.class));
        cards.add(new SetCardInfo("Reckless One", 222, Rarity.UNCOMMON, mage.cards.r.RecklessOne.class));
        cards.add(new SetCardInfo("Reminisce", 105, Rarity.UNCOMMON, mage.cards.r.Reminisce.class));
        cards.add(new SetCardInfo("Renewed Faith", 50, Rarity.COMMON, mage.cards.r.RenewedFaith.class));
        cards.add(new SetCardInfo("Righteous Cause", 51, Rarity.UNCOMMON, mage.cards.r.RighteousCause.class));
        cards.add(new SetCardInfo("Riptide Biologist", 106, Rarity.COMMON, mage.cards.r.RiptideBiologist.class));
        cards.add(new SetCardInfo("Riptide Chronologist", 107, Rarity.UNCOMMON, mage.cards.r.RiptideChronologist.class));
        cards.add(new SetCardInfo("Riptide Entrancer", 108, Rarity.RARE, mage.cards.r.RiptideEntrancer.class));
        cards.add(new SetCardInfo("Riptide Laboratory", 322, Rarity.RARE, mage.cards.r.RiptideLaboratory.class));
        cards.add(new SetCardInfo("Riptide Replicator", 309, Rarity.RARE, mage.cards.r.RiptideReplicator.class));
        cards.add(new SetCardInfo("Riptide Shapeshifter", 109, Rarity.UNCOMMON, mage.cards.r.RiptideShapeshifter.class));
        cards.add(new SetCardInfo("Rorix Bladewing", 224, Rarity.RARE, mage.cards.r.RorixBladewing.class));
        cards.add(new SetCardInfo("Rotlung Reanimator", 164, Rarity.RARE, mage.cards.r.RotlungReanimator.class));
        cards.add(new SetCardInfo("Rummaging Wizard", 110, Rarity.UNCOMMON, mage.cards.r.RummagingWizard.class));
        cards.add(new SetCardInfo("Run Wild", 279, Rarity.UNCOMMON, mage.cards.r.RunWild.class));
        cards.add(new SetCardInfo("Sage Aven", 111, Rarity.COMMON, mage.cards.s.SageAven.class));
        cards.add(new SetCardInfo("Sandskin", 52, Rarity.COMMON, mage.cards.s.Sandskin.class));
        cards.add(new SetCardInfo("Screaming Seahawk", 112, Rarity.COMMON, mage.cards.s.ScreamingSeahawk.class));
        cards.add(new SetCardInfo("Screeching Buzzard", 165, Rarity.COMMON, mage.cards.s.ScreechingBuzzard.class));
        cards.add(new SetCardInfo("Searing Flesh", 225, Rarity.UNCOMMON, mage.cards.s.SearingFlesh.class));
        cards.add(new SetCardInfo("Sea's Claim", 113, Rarity.COMMON, mage.cards.s.SeasClaim.class));
        cards.add(new SetCardInfo("Seaside Haven", 323, Rarity.UNCOMMON, mage.cards.s.SeasideHaven.class));
        cards.add(new SetCardInfo("Secluded Steppe", 324, Rarity.COMMON, mage.cards.s.SecludedSteppe.class));
        cards.add(new SetCardInfo("Serpentine Basilisk", 280, Rarity.UNCOMMON, mage.cards.s.SerpentineBasilisk.class));
        cards.add(new SetCardInfo("Severed Legion", 166, Rarity.COMMON, mage.cards.s.SeveredLegion.class));
        cards.add(new SetCardInfo("Shaleskin Bruiser", 226, Rarity.UNCOMMON, mage.cards.s.ShaleskinBruiser.class));
        cards.add(new SetCardInfo("Shared Triumph", 53, Rarity.RARE, mage.cards.s.SharedTriumph.class));
        cards.add(new SetCardInfo("Shepherd of Rot", 168, Rarity.COMMON, mage.cards.s.ShepherdOfRot.class));
        cards.add(new SetCardInfo("Shock", 227, Rarity.COMMON, mage.cards.s.Shock.class));
        cards.add(new SetCardInfo("Sigil of the New Dawn", 55, Rarity.RARE, mage.cards.s.SigilOfTheNewDawn.class));
        cards.add(new SetCardInfo("Silent Specter", 169, Rarity.RARE, mage.cards.s.SilentSpecter.class));
        cards.add(new SetCardInfo("Silklash Spider", 281, Rarity.RARE, mage.cards.s.SilklashSpider.class));
        cards.add(new SetCardInfo("Silvos, Rogue Elemental", 282, Rarity.RARE, mage.cards.s.SilvosRogueElemental.class));
        cards.add(new SetCardInfo("Skirk Fire Marshal", 229, Rarity.RARE, mage.cards.s.SkirkFireMarshal.class));
        cards.add(new SetCardInfo("Skirk Prospector", 230, Rarity.COMMON, mage.cards.s.SkirkProspector.class));
        cards.add(new SetCardInfo("Skittish Valesk", 231, Rarity.UNCOMMON, mage.cards.s.SkittishValesk.class));
        cards.add(new SetCardInfo("Slate of Ancestry", 310, Rarity.RARE, mage.cards.s.SlateOfAncestry.class));
        cards.add(new SetCardInfo("Slice and Dice", 232, Rarity.UNCOMMON, mage.cards.s.SliceAndDice.class));
        cards.add(new SetCardInfo("Slipstream Eel", 114, Rarity.COMMON, mage.cards.s.SlipstreamEel.class));
        cards.add(new SetCardInfo("Smother", 170, Rarity.UNCOMMON, mage.cards.s.Smother.class));
        cards.add(new SetCardInfo("Snarling Undorak", 283, Rarity.COMMON, mage.cards.s.SnarlingUndorak.class));
        cards.add(new SetCardInfo("Solar Blast", 234, Rarity.COMMON, mage.cards.s.SolarBlast.class));
        cards.add(new SetCardInfo("Soulless One", 171, Rarity.UNCOMMON, mage.cards.s.SoullessOne.class));
        cards.add(new SetCardInfo("Sparksmith", 235, Rarity.COMMON, mage.cards.s.Sparksmith.class));
        cards.add(new SetCardInfo("Spined Basher", 172, Rarity.COMMON, mage.cards.s.SpinedBasher.class));
        cards.add(new SetCardInfo("Spitfire Handler", 236, Rarity.UNCOMMON, mage.cards.s.SpitfireHandler.class));
        cards.add(new SetCardInfo("Spitting Gourna", 284, Rarity.COMMON, mage.cards.s.SpittingGourna.class));
        cards.add(new SetCardInfo("Spurred Wolverine", 237, Rarity.COMMON, mage.cards.s.SpurredWolverine.class));
        cards.add(new SetCardInfo("Stag Beetle", 285, Rarity.RARE, mage.cards.s.StagBeetle.class));
        cards.add(new SetCardInfo("Standardize", 116, Rarity.RARE, mage.cards.s.Standardize.class));
        cards.add(new SetCardInfo("Starlit Sanctum", 325, Rarity.UNCOMMON, mage.cards.s.StarlitSanctum.class));
        cards.add(new SetCardInfo("Starstorm", 238, Rarity.RARE, mage.cards.s.Starstorm.class));
        cards.add(new SetCardInfo("Steely Resolve", 286, Rarity.RARE, mage.cards.s.SteelyResolve.class));
        cards.add(new SetCardInfo("Strongarm Tactics", 173, Rarity.RARE, mage.cards.s.StrongarmTactics.class));
        cards.add(new SetCardInfo("Sunfire Balm", 56, Rarity.UNCOMMON, mage.cards.s.SunfireBalm.class));
        cards.add(new SetCardInfo("Supreme Inquisitor", 117, Rarity.RARE, mage.cards.s.SupremeInquisitor.class));
        cards.add(new SetCardInfo("Swamp", 339, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 340, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 341, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 342, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swat", 174, Rarity.COMMON, mage.cards.s.Swat.class));
        cards.add(new SetCardInfo("Symbiotic Beast", 287, Rarity.UNCOMMON, mage.cards.s.SymbioticBeast.class));
        cards.add(new SetCardInfo("Symbiotic Elf", 288, Rarity.COMMON, mage.cards.s.SymbioticElf.class));
        cards.add(new SetCardInfo("Symbiotic Wurm", 289, Rarity.RARE, mage.cards.s.SymbioticWurm.class));
        cards.add(new SetCardInfo("Syphon Mind", 175, Rarity.COMMON, mage.cards.s.SyphonMind.class));
        cards.add(new SetCardInfo("Syphon Soul", 176, Rarity.COMMON, mage.cards.s.SyphonSoul.class));
        cards.add(new SetCardInfo("Taunting Elf", 290, Rarity.COMMON, mage.cards.t.TauntingElf.class));
        cards.add(new SetCardInfo("Tempting Wurm", 291, Rarity.RARE, mage.cards.t.TemptingWurm.class));
        cards.add(new SetCardInfo("Tephraderm", 239, Rarity.RARE, mage.cards.t.Tephraderm.class));
        cards.add(new SetCardInfo("Thrashing Mudspawn", 177, Rarity.UNCOMMON, mage.cards.t.ThrashingMudspawn.class));
        cards.add(new SetCardInfo("Threaten", 241, Rarity.UNCOMMON, mage.cards.t.Threaten.class));
        cards.add(new SetCardInfo("Thunder of Hooves", 242, Rarity.UNCOMMON, mage.cards.t.ThunderOfHooves.class));
        cards.add(new SetCardInfo("Towering Baloth", 292, Rarity.UNCOMMON, mage.cards.t.ToweringBaloth.class));
        cards.add(new SetCardInfo("Trade Secrets", 118, Rarity.RARE, mage.cards.t.TradeSecrets.class));
        cards.add(new SetCardInfo("Tranquil Thicket", 326, Rarity.COMMON, mage.cards.t.TranquilThicket.class));
        cards.add(new SetCardInfo("Treespring Lorian", 293, Rarity.COMMON, mage.cards.t.TreespringLorian.class));
        cards.add(new SetCardInfo("Tribal Unity", 294, Rarity.UNCOMMON, mage.cards.t.TribalUnity.class));
        cards.add(new SetCardInfo("Trickery Charm", 119, Rarity.COMMON, mage.cards.t.TrickeryCharm.class));
        cards.add(new SetCardInfo("True Believer", 57, Rarity.RARE, mage.cards.t.TrueBeliever.class));
        cards.add(new SetCardInfo("Undead Gladiator", 178, Rarity.RARE, mage.cards.u.UndeadGladiator.class));
        cards.add(new SetCardInfo("Unholy Grotto", 327, Rarity.RARE, mage.cards.u.UnholyGrotto.class));
        cards.add(new SetCardInfo("Venomspout Brackus", 295, Rarity.UNCOMMON, mage.cards.v.VenomspoutBrackus.class));
        cards.add(new SetCardInfo("Visara the Dreadful", 179, Rarity.RARE, mage.cards.v.VisaraTheDreadful.class));
        cards.add(new SetCardInfo("Vitality Charm", 296, Rarity.COMMON, mage.cards.v.VitalityCharm.class));
        cards.add(new SetCardInfo("Voice of the Woods", 297, Rarity.RARE, mage.cards.v.VoiceOfTheWoods.class));
        cards.add(new SetCardInfo("Voidmage Prodigy", 120, Rarity.RARE, mage.cards.v.VoidmageProdigy.class));
        cards.add(new SetCardInfo("Walking Desecration", 180, Rarity.UNCOMMON, mage.cards.w.WalkingDesecration.class));
        cards.add(new SetCardInfo("Wall of Mulch", 298, Rarity.UNCOMMON, mage.cards.w.WallOfMulch.class));
        cards.add(new SetCardInfo("Wave of Indifference", 243, Rarity.COMMON, mage.cards.w.WaveOfIndifference.class));
        cards.add(new SetCardInfo("Weathered Wayfarer", 59, Rarity.RARE, mage.cards.w.WeatheredWayfarer.class));
        cards.add(new SetCardInfo("Weird Harvest", 299, Rarity.RARE, mage.cards.w.WeirdHarvest.class));
        cards.add(new SetCardInfo("Wellwisher", 300, Rarity.COMMON, mage.cards.w.Wellwisher.class));
        cards.add(new SetCardInfo("Wheel and Deal", 121, Rarity.RARE, mage.cards.w.WheelAndDeal.class));
        cards.add(new SetCardInfo("Whipcorder", 60, Rarity.UNCOMMON, mage.cards.w.Whipcorder.class));
        cards.add(new SetCardInfo("Windswept Heath", 328, Rarity.RARE, mage.cards.w.WindsweptHeath.class, new CardGraphicInfo(new ObjectColor("GW"), null, false)));
        cards.add(new SetCardInfo("Wirewood Elf", 301, Rarity.COMMON, mage.cards.w.WirewoodElf.class));
        cards.add(new SetCardInfo("Wirewood Herald", 302, Rarity.COMMON, mage.cards.w.WirewoodHerald.class));
        cards.add(new SetCardInfo("Wirewood Lodge", 329, Rarity.RARE, mage.cards.w.WirewoodLodge.class));
        cards.add(new SetCardInfo("Wirewood Pride", 303, Rarity.COMMON, mage.cards.w.WirewoodPride.class));
        cards.add(new SetCardInfo("Wirewood Savage", 304, Rarity.COMMON, mage.cards.w.WirewoodSavage.class));
        cards.add(new SetCardInfo("Withering Hex", 181, Rarity.UNCOMMON, mage.cards.w.WitheringHex.class));
        cards.add(new SetCardInfo("Wooded Foothills", 330, Rarity.RARE, mage.cards.w.WoodedFoothills.class, new CardGraphicInfo(new ObjectColor("RG"), null, false)));
        cards.add(new SetCardInfo("Words of War", 244, Rarity.RARE, mage.cards.w.WordsOfWar.class));
        cards.add(new SetCardInfo("Words of Waste", 182, Rarity.RARE, mage.cards.w.WordsOfWaste.class));
        cards.add(new SetCardInfo("Words of Wilding", 305, Rarity.RARE, mage.cards.w.WordsOfWilding.class));
        cards.add(new SetCardInfo("Words of Wind", 122, Rarity.RARE, mage.cards.w.WordsOfWind.class));
        cards.add(new SetCardInfo("Words of Worship", 61, Rarity.RARE, mage.cards.w.WordsOfWorship.class));
        cards.add(new SetCardInfo("Wretched Anurid", 183, Rarity.COMMON, mage.cards.w.WretchedAnurid.class));
    }
}
