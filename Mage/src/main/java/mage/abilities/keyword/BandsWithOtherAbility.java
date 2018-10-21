
package mage.abilities.keyword;

import mage.abilities.StaticAbility;
import mage.constants.SubType;
import mage.constants.Zone;

/**
 *
 * @author L_J
 */
public class BandsWithOtherAbility extends StaticAbility {

    private SubType subtype;

    public BandsWithOtherAbility(SubType subtype) {
        super(Zone.ALL, null);
        this.subtype = subtype;
    }

    public BandsWithOtherAbility(BandsWithOtherAbility ability) {
        super(ability);
        this.subtype = ability.subtype;
    }

    @Override
    public BandsWithOtherAbility copy() {
        return new BandsWithOtherAbility(this);
    }

    public SubType getSubtype() {
        return subtype;
    }

    @Override
    public String getRule() {
        return new StringBuilder("bands with other ").append(subtype.getDescription()).append('s').toString();
    }

}
