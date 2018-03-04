/*
 * Copyright 2017 Sophos Limited. All rights reserved.
 *
 * 'Sophos' and 'Sophos Anti-Virus' are registered trademarks of Sophos Limited and Sophos Group. All other product
 * and company names mentioned are trademarks or registered trademarks of their respective owners.
 */

package guru.springframework.web.rest.errors;

public class BadRequestAlertException extends RuntimeException {

    public BadRequestAlertException(final String s, final String entityName, final String idexists) {
    }
}
